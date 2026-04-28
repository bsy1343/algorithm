# [Platinum I] Holy cow, Vim! (Hard) - 19677

[문제 링크](https://www.acmicpc.net/problem/19677)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 131, 정답: 51, 맞힌 사람: 33, 정답 비율: 38.372%

### 분류

애드 혹, 해 구성하기

### 문제 설명

<p>Little Johnny is attending a summer programming camp. The very first assignment was to write a program that reads a number&nbsp;<em>x</em>&nbsp;and prints the same number&nbsp;<em>x</em>. Johnny&rsquo;s program was already working, but then an accident happened. While using the Vim editor, Johnny pressed something without paying attention and his program got turned upside down. That is, he somehow reversed the order of lines in his program.</p>

<p>To Johnny&rsquo;s amazement, the program still worked, but now it did something different: it read&nbsp;<em>x</em>&nbsp;and printed&nbsp;<em>x</em><sup>2</sup>.</p>

<p>Johnny tried to remember what he pressed to put the lines back in the correct order, but he made another mistake and Vim sorted the lines of his program. Johnny tried the new program and was completely lost for words: the program now read&nbsp;<em>x</em>&nbsp;and printed&nbsp;&minus;<em>x</em>.</p>

<p>&ldquo;Holy cow, Vim is magic! I&rsquo;ll use it until the end of my life!&rdquo; exclaimed Johnny.</p>

<p>&ldquo;That&rsquo;s just because nobody knows how to exit it,&rdquo; another student yelled back.</p>

<p>Can you write a program that behaves the same way as Johnny&rsquo;s program?</p>

<p>In this problem, you&rsquo;ll use a simple stack-based programming language. The memory is a stack of signed integers. Various commands push values onto the stack or pop values from the top of the stack. The stack is initially empty and may be left non-empty when the program ends.</p>

<p>A program consists of several&nbsp;<em>lines</em>, and each line consists of one or more&nbsp;<em>commands</em>&nbsp;separated by semicolons. A command can be one of the following:</p>

<ul>
	<li>
	<p>&ldquo;<code>input</code>&rdquo;: Reads the number&nbsp;<em>x</em>&nbsp;from the input and pushes it onto the stack. You may only execute &ldquo;<code>input</code>&rdquo; once per an execution of your program.</p>
	</li>
	<li>
	<p>&ldquo;<code>jump</code>&nbsp;<em>j</em>&rdquo;: Immediately jumps to the beginning of line&nbsp;<em>j</em>. Lines are numbered counting from&nbsp;0&nbsp;to&nbsp;<em>n</em> &minus; 1&nbsp;where&nbsp;<em>n</em>&nbsp;is the number of lines. Jumping to&nbsp;<em>j</em> = <em>n</em>&nbsp;exits the program. Jumping to&nbsp;<em>j</em> &lt; 0&nbsp;or&nbsp;<em>j</em> &gt; <em>n</em>&nbsp;is an error.</p>
	</li>
	<li>
	<p>&ldquo;<code>pop</code>&rdquo;: Removes the top element from the stack. Results in an error if the stack is empty.</p>
	</li>
	<li>
	<p>&ldquo;<code>print</code>&rdquo;: Removes the top element from the stack and prints its value. Results in an error if the stack is empty. You may only execute &ldquo;<code>print</code>&rdquo; once per an execution of your program.</p>
	</li>
	<li>
	<p>&ldquo;<code>push</code>&nbsp;<em>p</em>&rdquo;: Pushes the constant&nbsp;<em>p</em>&nbsp;onto the top of the stack.</p>
	</li>
	<li>
	<p>&ldquo;<code>dup</code>&rdquo;: Duplicates the top element of the stack. If the current top element is&nbsp;<em>t</em>, &ldquo;<code>dup</code>&rdquo; does the same thing as &ldquo;<code>push</code>&nbsp;<em>t</em>&rdquo;. Results in an error if the stack is empty.</p>
	</li>
	<li>
	<p>&ldquo;<code>+</code>&rdquo;, &ldquo;<code>-</code>&rdquo;, &ldquo;<code>*</code>&rdquo; and &ldquo;<code>/</code>&rdquo;: Pops the top element&nbsp;<em>a</em>&nbsp;from the stack, then pops the next element&nbsp;<em>b</em>&nbsp;from the stack, then pushes&nbsp;<em>a</em> + <em>b</em>,&nbsp;<em>a</em> &minus; <em>b</em>,&nbsp;<em>a</em> &sdot; <em>b</em>, or&nbsp;<em>a</em>/<em>b</em>&nbsp;rounded towards zero, respectively. Results in an error if the stack contains fewer than two numbers. Division by zero is also an error.</p>
	</li>
</ul>

<p>The language is very strict. You cannot use any extra whitespace or semicolons or anything like that.</p>

<p>Only integers between&nbsp;&minus;2<sup>31</sup>&nbsp;and&nbsp;2<sup>31</sup> &minus; 1&nbsp;(inclusive) are supported. Pushing an integer outside of this range to the stack is an error.</p>

### 입력

<p>There is no input.</p>

### 출력

<p>Your task is to write a program that reads an integer&nbsp;<em>x</em>&nbsp;and outputs&nbsp;<em>x</em>. However, if the order of the lines of the program is reversed (i.e., the last line becomes the first line, etc.), the new program should output&nbsp;<em>x</em><sup>2</sup>. And if the lines of the program are sorted lexicographically, it should output&nbsp;&minus;<em>x</em>.</p>

<p>You may assume that&nbsp;|<em>x</em>|&le;30 000.</p>

<p>The program can have at most 1000 lines. For any valid&nbsp;<em>x</em>&nbsp;your program must terminate after the execution of at most&nbsp;10 000&nbsp;commands.</p>

<p>Each line may contain&nbsp;<strong>at most two commands</strong>.</p>

### 힌트

<p>The above program reads&nbsp;<em>x</em>&nbsp;and outputs&nbsp;<em>x</em> &minus; 7.</p>

<p>If you reverse the order of lines of the above program, &ldquo;print&rdquo; will become the first command, and the program will fail because it tries to print the top of an empty stack.</p>