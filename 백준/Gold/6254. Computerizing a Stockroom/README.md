# [Gold IV] Computerizing a Stockroom - 6254

[문제 링크](https://www.acmicpc.net/problem/6254)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 17, 정답: 5, 맞힌 사람: 4, 정답 비율: 25.000%

### 분류

많은 조건 분기, 자료 구조, 해시를 사용한 집합과 맵, 구현, 파싱, 문자열, 집합과 맵

### 문제 설명

<p>Jobs is a stock clerk who has been working in a computer manufacturing company since its establishment time. He is responsible for any transaction done in the stockroom where computer parts are stored. Jobs is an old-fashioned employee who yet insists to register any transaction in his booklet and resists to make transaction registration computerized. He did not believe in modern technologies till today when his boss asked him to provide a summary report on the current state of the stockroom, including the computers given out to employees, and working and nonworking computer parts remaining in the stockroom. He is so nervous as the report is due tonight. He does not have enough time to manually prepare a report from many transactions in his booklet. Now, he believes in modern technologies and asks you to write a program which gets all transactions as input, and outputs the report soon.</p>

<p>Each transaction written on his booklet starts with a date-time, and is followed by one of the following templates:</p>

<ul>
	<li>Bought &lt;NUM&gt; &lt;PIECE&gt;.</li>
	<li>Assembled a computer for &lt;PERSON&gt; using &lt;PIECES&gt;.</li>
	<li>Got the computer of &lt;PERSON&gt; back and disassembled it.</li>
	<li>Found that &lt;A&gt; &lt;PIECE&gt; is not working.</li>
	<li>&lt;A&gt; &lt;PIECE&gt; is repaired and now can be used again.</li>
</ul>

<p>The placeholders used above are defined as below (the first letter is capitalized in the case of appearing at the beginning of a sentence):</p>

<ul>
	<li>&lt;A&gt;: it is either &ldquo;a&rdquo; or &ldquo;an&rdquo; depending on its successive word.</li>
	<li>&lt;NUM&gt;: it is either &lt;A&gt; (which means 1), or &ldquo;ܺ items of&rdquo; where ܺ is an integer greater than 1.</li>
	<li>&lt;PERSON&gt;: it represents the full name of an employee, containing a number of space-separated words all starting with capital letters.</li>
	<li>&lt;PIECES&gt;: it is a list of &ldquo;&lt;NUM&gt; &lt;PIECE&gt;&rdquo;, separated with commas. There are always at least 2 entries in the list, and an extra &ldquo;and&rdquo; will follow the last comma (before the last entry).</li>
	<li>&lt;PIECE&gt;: it is a phrase including a computer-part name (like RAM or CPU) and possibly some extra data which may represent the model, speed, capacity, etc.</li>
</ul>

<p>You can assume that each entity (computer-part type or employee name) is always referenced with a unique case-sensitive phrase, and that no two different entities are referenced with the same phrase, even case-insensitively. All computer parts that are bought are initially working; only working computer parts are used for assembling a computer. Each employee has at most one computer at any time and all transactions are logically valid at the time of writing.</p>

### 입력

<p>There are multiple test cases in the input. Each test case starts with a line containing the integer n (1 &le; n &le; 500), the number of transactions. A transaction is given on each of the next n lines. The date-time format is &ldquo;year-month-day hour&rdquo; where parameters year, month, day, and hour are in the ranges [2000, 2012], [1, 12], [1, 31], and [0, 23] respectively and may be padded with a &ldquo;0&rdquo; in the case of being less than 10. The date-times are unique within each test case. The date-time is separated from the transaction sentence with the string &ldquo; - &rdquo;. All numbers used in &lt;NUM&gt; are less than 10<sup>5</sup>. For your convenience, each two consecutive words in the input are separated with a single space, and employee names and computer-part types are wrapped with quotation marks and all characters appearing in the input are alphanumeric. Refer to the sample input for the details. The input terminates with a line containing a single &ldquo;0&rdquo; which should not be processed as a test case.</p>

### 출력

<p>For each test case, write several lines of information. On the first line, write ܺ, the number of employees who currently have a computer in the following format:</p>

<ul>
	<li>If X &gt; 1, write &ldquo;There are X employees who currently have a computer:&rdquo;.</li>
	<li>If X = 1, write &ldquo;There is one employee who currently has a computer:&rdquo;.</li>
	<li>If X = 0, write &ldquo;No computer is currently given out to the employees.&rdquo;.</li>
</ul>

<p>Then, print X lines, each with the full name of one of those employees. These X lines must be sorted in the lexicographic order.</p>

<p>On the next lines, print some sentences about the current state of all computer-part types written in the booklet. There must be exactly one line for each type. The lines must be sorted in the lexicographic order based on the piece phrases. For each piece phrase &lt;PIECE&gt;, its corresponding line must be in one of the following forms:</p>

<ul>
	<li>If there is no item of the part type currently remaining in the stockroom, then write<br />
	&ldquo;There is no &quot;&lt;PIECE&gt;&quot; left in the stockroom.&rdquo;.</li>
	<li>If there is only one item of the part type remaining in the stockroom, and it is working, then write<br />
	&ldquo;There is one &quot;&lt;PIECE&gt;&quot; left in the stockroom which is working.&rdquo;.</li>
	<li>If there is only one item of the part type remaining in the stockroom, and it is not working, then write<br />
	&ldquo;There is one &quot;&lt;PIECE&gt;&quot; left in the stockroom which is not working.&rdquo;.</li>
	<li>If there are X (X &gt; 1) items of the part type left in the stockroom, and all of them are working, then write<br />
	&ldquo;There are ܺ items of &quot;&lt;PIECE&gt;&quot; left in the stockroom, all working.&rdquo;.</li>
	<li>If there are X (X &gt; 1) items of the part type left in the stockroom, and all of them are not working, then write<br />
	&ldquo;There are ܺ items of &quot;&lt;PIECE&gt;&quot; left in the stockroom, all not working.&rdquo;.</li>
	<li>If there are X (X &gt; 1) items of the part type left in the stockroom, and Y number of them are working and Z number of them are not working (Y,Z &gt; 0), then write<br />
	&ldquo;There are X items of &quot;&lt;PIECE&gt;&quot; left in the stockroom, Y working and Z not working.&rdquo;.</li>
</ul>

<p>Print a line containing &ldquo;###&rdquo; between every two consecutive test cases. Note that when you compare two multi-word phrases, you first compare the first words of the two phrases. If they are equal, you must continue with the second words of the two phrases and so on in the case of equality of the second words. If all words of the shorter phrase match the corresponding words of the longer phrase, the shorter phrase comes first. In lexicographic comparison of the words, digits have a higher priority than letters, and the letters are compared case-insensitively. So, &ldquo;A AB&rdquo; &lt; &ldquo;A10&rdquo; &lt; &ldquo;A2&rdquo; &lt; &ldquo;aa&rdquo; = &ldquo;AA&rdquo; &lt; &ldquo;AA B&rdquo;.</p>