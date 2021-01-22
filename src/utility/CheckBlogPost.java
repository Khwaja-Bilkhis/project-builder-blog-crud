package utility;

import java.util.ArrayList;

import com.sun.tools.javac.util.List;

import model.Blog;

public class CheckBlogPost extends OffensiveWordsChecker implements OffensiveWordsInterface {
	ArrayList<String> offWords=new ArrayList<String>(List.of(
			"junglebunny",
			"junkie"     ,
			"junky"      ,
			"kafir"      ,
			"kawk"       ,
			"kike"       ,
			"kikes"      ,
			"kill"       ,
			"kinbaku"    ,
			"kinkster"   ,
			"kinky"      ,
			"klan"       ,
			"knob"       ,
			"knob end"   ,
			"knobbing"   ,
			"knobead"    ,
			"knobed"     ,
			"knobend"    ,
			"knobhead"   ,
			"knobjocky"  ,
			"knobjokey"  ,
			"kock"       ,
			"kondum"     ,
			"kondums"    ,
			"kooch"      ,
			"kooches"    ,
			"kootch"     ,
			"kraut"      ,
			"kum"        ,
			"kummer"     ,
			"kumming"    ,
			"kums"       ,
			"kunilingus" ,
			"kunja"      ,
			"kunt"       ,
			"kwif"       ,
			"kwif"      ,
			"kyke"       ,
			"l3i+ch"     ,
			"l3itch"     
			));
	

	public boolean checkBlogTitle(Blog blog) {
String[] words=blog.getBlogTitle().split("(\\s)+");
		
		for (String word : words) {
			if(offWords.contains(word)) {
				return false;
			}
		}		
		return true;
	}

	
	public boolean checkBlogDescription(Blog blog) {
String[] words=blog.getBlogDescription().split("(\\s)+");
		
		for (String word : words) {
			if(offWords.contains(word)) {
				return false;
			}
		}		
		return true;
	}

	@Override
	public boolean checkBlog(Blog blog) {
		return checkBlogTitle(blog)&& checkBlogDescription(blog);
		
	}

}
