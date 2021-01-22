package service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

import model.Blog;

public class CRUDOperations {
	static List<Blog> list=new ArrayList<Blog>(); // Store the blog in the list
	
	public List<Blog> createBlog(Blog blog) throws IOException {
		list.add(blog);
		viewBlog(blog);
		Collections.sort(list, (blog1, blog2) -> blog1.getBlogTitle().compareTo(blog2.getBlogTitle()));
		return list;
	}
	
	public List<Blog> viewBlog(Blog blog) throws IOException{
		
		System.out.println("Title:"+blog.getBlogTitle());
		System.out.println("Discription:"+blog.getBlogDescription());
		return list;
		
	}
	public List<Blog> updateBlog(Blog blog) throws IOException{
			for(Blog b:list) {
				if(b.getBlogTitle().equals(blog.getBlogTitle())) {
					list.remove(b);
					list.add(blog);
				}
			}
			return list;
	}
	public List<Blog> deleteBlog(Blog blog) throws IOException{
		list.remove(blog);
		return list;
		
	}
	
	public List addBlog(Blog blog) {
		list.add(blog);
		System.out.println(blog);
		return list;
	}
	
}
