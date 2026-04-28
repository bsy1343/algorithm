# [Gold V] NIZOVI - 11954

[문제 링크](https://www.acmicpc.net/problem/11954)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 530, 정답: 252, 맞힌 사람: 217, 정답 비율: 51.914%

### 분류

구현, 문자열, 파싱

### 문제 설명

<p>An array in a certain programming language is defined in the following way:</p>

<ul>
	<li>The beginning and the end of an array is denoted by an open and closed curly bracket, respectively.</li>
	<li>Inside the curly braces, there are (possibly even 0) values separated by a comma (there is no comma after the last value in the array).</li>
	<li>Each value can be a word (an array of lowercase letters of the English alphabet) or another array.</li>
	<li>Examples of correctly defined arrays are: {}, {a,b,c}, {abc,znj,{novi,niz},pozz}.</li>
</ul>

<p>Recently, you&rsquo;ve noticed that the programming language does not throw an error if you do not place the appropriate number of spaces and new lines before or after the curly braces or the commas. Given the fact that you too mind the values being so &bdquo;squished&ldquo; together, you&rsquo;ve decided to get to work and modify the shape of the array in the following way:</p>

<ul>
	<li>Each value that is not an array or denotes the beginning or the end of the array (curly braces) will be in its own line.</li>
	<li>The commas are &bdquo;connected&ldquo; with the value located directly before them and there is a new line after each comma.</li>
	<li>After the curly bracket denoting the beginning of the array, the indentation of the content increases (shifting the output to the right) for 2 spaces.</li>
	<li>Before the curly bracket denoting the end of the array &rsquo;}&rsquo;, the indentation of the content decreases (shifting the output to the left) for 2 spaces.</li>
</ul>

### 입력

<p>The first line of input contains an array of characters S (1 &le; |S| &le; 1500), representing the array from the task.</p>

### 출력

<p>The output must consist of the modified version of the array from the task.</p>

### 힌트

<p>Clarification of the fourth example: In the beginning, there is no indentation, it is 0. After the first curly bracket, there is a new line and the indentation increases by 2 spaces.</p>

<p>After that, the word &bdquo;a&ldquo; is printed, as well as the comma right after it, then the new line with the same indentation of 2 spaces. The same procedure is repeated for the word &bdquo;b&ldquo;.</p>

<p>The third value in the array is a new array (let&rsquo;s call it array X). It begins with a curly bracket, so we need to print a new line and increase the indentation for 2 spaces. The indentation is now a total of 4 spaces. Using that indentation, we print the words &bdquo;c&ldquo; and &bdquo;d&ldquo; each in its own line. After the word &bdquo;d&ldquo;, there is no comma because it is the last value in the array X.</p>

<p>Before we print the curly bracket that denotes the end of array X, we need to decrease the indentation for 2. After the curly bracket, we print the comma and a new line and the continue printing the values from the main array.</p>