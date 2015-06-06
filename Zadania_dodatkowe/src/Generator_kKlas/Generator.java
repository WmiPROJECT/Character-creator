package Generator_kKlas;

import java.util.*;
import java.io.*;

public class Generator {
	private String name;
	private int attributes_quantity;

	public int getAttributes_quantity() {
		return attributes_quantity;
	}

	public void setAttributes_quantity(int attributes_quantity) {
		this.attributes_quantity = attributes_quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Generator gen = new Generator();

		System.out.println("            CLASS GENERATOR      ");
		System.out.println("[===================================]");
		System.out.print("Set class name: ");
		gen.setName(sc.nextLine());
		System.out.println("[===================================]");

		System.out.print("Set attributes quantity: ");
		gen.setAttributes_quantity(sc.nextInt());
		System.out.println("[===================================]");

		String[] types = new String[gen.attributes_quantity + 1];
		String[] names = new String[gen.attributes_quantity + 1];

		System.out.println("Set attributes types and names\n");

		int first_loop = 0;
		for (int i = 0; i < gen.attributes_quantity; i++) {
			if (i != 0) {
				System.out.print(">>Quantity number: ");
				System.out.println(i);
				System.out.print("Set type(int,string etc): ");
			}
			types[i] = sc.nextLine();
			if (i != 0) {
				System.out.print("Set attribute name: ");
				names[i] = sc.nextLine();

			}
			first_loop++;
		}
		System.out.print(">>Quantity number ");
		System.out.println(first_loop);
		System.out.print("Set type(int,string etc): ");
		types[first_loop] = sc.nextLine();
		System.out.print("Set attribute name: ");
		names[first_loop] = sc.nextLine();

		System.out.println("[===================================]");
		sc.close();

		// -----------------------------------------------------------------------------------
		// FILE_CPP
		FileWriter file_cpp = null;
		try {
			file_cpp = new FileWriter("main.cpp");
			String[] before_class = { "#include \"main.hpp\"",
					"#include <string>", "#include <iostream>",
					"using namespace std;", "\n" };
			for (int i = 0; i < before_class.length; i++) {
				file_cpp.write(before_class[i]);
				file_cpp.write("\n");
			}
			for (int i = 1; i < gen.getAttributes_quantity() + 1; i++) {
				file_cpp.write("void ");
				file_cpp.write(gen.getName());
				file_cpp.write("::set");
				file_cpp.write(names[i]);
				file_cpp.write("(");
				file_cpp.write(types[i]);
				file_cpp.write(" x){");
				file_cpp.write("\n    ");
				file_cpp.write(names[i]);
				file_cpp.write("=x;\n}\n");
				file_cpp.write(types[i]);
				file_cpp.write(" ");
				file_cpp.write(gen.getName());
				file_cpp.write("::get");
				file_cpp.write(names[i]);
				file_cpp.write("(){\n    return ");
				file_cpp.write(names[i]);
				file_cpp.write(";\n}\n");

			}
			file_cpp.write(gen.getName());
			file_cpp.write("::");
			file_cpp.write(gen.getName());
			file_cpp.write("(");
			for (int i = 1; i < gen.getAttributes_quantity(); i++) {
				file_cpp.write(types[i]);
				file_cpp.write(" x");
				file_cpp.write(new Integer(i).toString());
				file_cpp.write(", ");
			}
			file_cpp.write(types[gen.getAttributes_quantity()]);
			file_cpp.write(" x");
			file_cpp.write(new Integer(gen.getAttributes_quantity()).toString());
			file_cpp.write("){\n");
			for (int i = 1; i < gen.getAttributes_quantity() + 1; i++) {
				file_cpp.write("    ");
				file_cpp.write(names[i]);
				file_cpp.write("=x");
				file_cpp.write(new Integer(i).toString());
				file_cpp.write(";\n");
			}
			file_cpp.write("}\n\n");
			file_cpp.write("int main(){\n}");

			file_cpp.close();
			System.out.println("File \"main.cpp\" has been successfully created :)");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// -----------------------------------------------------------------------------------
		// FILE_HPP
		FileWriter file_hpp = null;
		try {
			file_hpp = new FileWriter("main.hpp");
			String[] before_class = { "#ifndef main_hpp", "#define main_hpp",
					"#include <iostream>", "using namespace std;", "\n" };
			for (int i = 0; i < before_class.length; i++) {
				file_hpp.write(before_class[i]);
				file_hpp.write("\n");
			}
			file_hpp.write("class ");
			file_hpp.write(gen.getName());
			file_hpp.write("{");
			file_hpp.write("\n");
			file_hpp.write("   protected:");
			file_hpp.write("\n");
			for (int i = 1; i < gen.getAttributes_quantity() + 1; i++) {
				file_hpp.write("       ");
				file_hpp.write(types[i]);
				file_hpp.write(" ");
				file_hpp.write(names[i]);
				file_hpp.write(";");
				file_hpp.write("\n");
			}
			file_hpp.write("\n");
			file_hpp.write("   public:");
			file_hpp.write("\n");
			for (int i = 1; i < gen.getAttributes_quantity() + 1; i++) {
				file_hpp.write("       ");
				file_hpp.write("void ");
				file_hpp.write("set");
				file_hpp.write(names[i]);
				file_hpp.write("( ");
				file_hpp.write(types[i]);
				file_hpp.write(" x );");
				file_hpp.write("\n");
				file_hpp.write("       ");
				file_hpp.write(types[i]);
				file_hpp.write(" get");
				file_hpp.write(names[i]);
				file_hpp.write("();");
				file_hpp.write("\n");
			}
			file_hpp.write("       ");
			file_hpp.write(gen.getName());
			file_hpp.write("(");
			for (int i = 1; i < gen.getAttributes_quantity(); i++) {
				file_hpp.write(types[i]);
				file_hpp.write(" x");
				file_hpp.write(new Integer(i).toString());
				file_hpp.write(", ");
			}
			file_hpp.write(types[gen.getAttributes_quantity()]);
			file_hpp.write(" x");
			file_hpp.write(new Integer(gen.getAttributes_quantity()).toString());
			file_hpp.write(");");
			file_hpp.write("\n");
			file_hpp.write("};");
			file_hpp.write("\n");
			file_hpp.write("#endif");
			file_hpp.close();
			System.out.println("File \"main.hpp\" has been successfully created :)");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
