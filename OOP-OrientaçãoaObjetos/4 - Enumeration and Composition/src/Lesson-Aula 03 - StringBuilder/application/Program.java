package application;

import java.time.LocalDateTime;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) {
		
		LocalDateTime moment1 = LocalDateTime.parse("21/06/2018 13:05:44", Post.getFmt());
		
		Comment c1 = new Comment("Have a nice trip");
		Comment c2 = new Comment("Wow that's awesome");
		Post p1 = new Post(moment1, "Traveling to New Zealand", "I'm going to visit this beautiful country!", 12);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		LocalDateTime moment2 = LocalDateTime.parse("28/07/2018 23:14:19", Post.getFmt());
		
		Comment c3 = new Comment("Good Night");
		Comment c4 = new Comment("May the Force be with you");
		Post p2 = new Post(moment2, "Good Night guys", "See you tomorrow", 5);
		
		p2.addComment(c3);
		p2.addComment(c4);

		System.out.println(p1);
		System.out.println(p2);
		
	}

}
