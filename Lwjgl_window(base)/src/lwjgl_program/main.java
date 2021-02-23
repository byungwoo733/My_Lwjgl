package lwjgl_program;

import static org.lwjgl.glfw.GLFW.*;

import org.lwjgl.glfw.GLFWVidMode;

public class main {
	public static void main(String[] arg){
		if (!glfwInit()){
			throw new IllegalStateException("Failed to initialize GLFW!");
		}
		
		glfwWindowHint(GLFW_VISIBLE, GLFW_FALSE);
		long window = glfwCreateWindow(640, 480, "My LWJGL Program", 0, 0);
		if (window == 0){
			throw new IllegalStateException("Failed to initialize GLFW!");
		}
		
		GLFWVidMode videoMode = glfwGetVideoMode(glfwGetPrimaryMonitor());
		glfwSetWindowPos(window, (videoMode.width() + 640) / 2, (videoMode.height() + 480) / 2);
		
		glfwShowWindow(window);
		
		while (!glfwWindowShouldClose(window)) {
			glfwPollEvents();
		}
	}

}
