# [Gold IV] Chemistry 101 - 2006

[문제 링크](https://www.acmicpc.net/problem/2006)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 132, 정답: 48, 맞힌 사람: 45, 정답 비율: 42.056%

### 분류

자료 구조, 해시를 사용한 집합과 맵, 구현, 파싱, 정렬, 문자열, 집합과 맵

### 문제 설명

<p>Chemistry is all about reactions&mdash;you throw a bunch of stuff into a test-tube, heat it up, hoping that it will neither explode or poison you, then cool it down and try to work out whether what you have is what you expected. That&rsquo;s the easy (and fun) bit&mdash;much harder is recording it all. As is usual with skills of this type, chemistry instructors the world over rely on drill&mdash;a seemingly endless set of reactions that the students have to complete. The trick is that everything that appears on the left side (the reagents, or &lsquo;input&rsquo;) must appear on the right side (the products, or &lsquo;output&rsquo;). This ought to be simple, but generations of chemistry students have demonstrated otherwise.</p>

<p>Professor Plumbius is getting tired of writing the same comments on his student&rsquo;s worksheets over and over and he wants to automate the process. He wants to be able to enter the equations as written by the students and have the computer produce the comments automatically, thus giving him more time to dream up more equations to give his students to practise on. This is where you come in.</p>

<p>Write a program that will read in a chemistry equation and determine whether it is balanced. If it isn&rsquo;t, your program must tell the student what elements are out of balance and by how much.</p>

<p>Normally a chemistry equation is written like this:</p>

<p>2H<sub>2</sub>O + SO<sub>2</sub> &larr;&rarr; H<sub>2</sub> + H<sub>2</sub>SO<sub>4</sub></p>

<p>but due to the limitations of computer input we will present it like this:</p>

<p>2H2O + SO2 = H2 + H2SO4</p>

<p>This example shows the essentials of an equation: each side consists of one or more molecules, separated by &lsquo;+&rsquo; signs (the spaces are optional). Each molecule may have a multiplier before it which specifies how many instances of that molecule take part in the reaction. A molecule consists of one or more elements. Each element has a symbol, which is either an uppercase letter, e.g., &lsquo;H&rsquo;, or an uppercase letter followed by a lowercase letter, e.g., &lsquo;Br&rsquo;. A symbol may be followed by a multiplier specifying how many atoms of that element are present in that part of the molecule. Thus the first term says that there are two instances of a molecule consisting of two atoms of H and one atom of O. (This happens to be water, but you do not need to know that.)</p>

<p>Given that these are exercises handed out to the students, the left hand sides are, by definition, correct. Thus your job is to determine whether all the atoms that appear on the left also appear on the right. If they do, then the equation is balanced. If not, you must report which elements have been created or lost and how much of each.</p>

### 입력

<p>Input will consist of a number of equations, each on a line by itself. Each line will contain no more than 250 characters. Each equation represents a set of reagents and a set of products, separated by an &lsquo;=&rsquo; sign. Each set will consist of one or more molecules, possibly with multipliers, separated by &lsquo;+&rsquo; signs. There may be zero or more spaces on either side of the &lsquo;+&rsquo; and &lsquo;=&rsquo; signs.</p>

<p>The last line of input will be a &lsquo;#&rsquo; on a line by itself. This line should not be processed.</p>

### 출력

<p>There will be at least one line of output for each equation in the input. If the equation is balanced this line will say &lsquo;Equation n is balanced.&rsquo;, where n is the equation number (starting from 1). If the equation does not balance, then the output line will say &lsquo;Equation n is unbalanced.&rsquo; and will be followed by a series of lines of the form</p>

<p><code>You have &lt;created or destroyed&gt; m &lt;atom or atoms&gt;&nbsp;of element. </code></p>

<p>where element is the symbol of the element concerned, m is the number of extra or missing atoms of that element, and &lsquo;atom(s)&rsquo; is singular or plural as appropriate. For each unbalanced equation, these lines should be ordered alphabetically by element symbol and terminated by a blank line. (Note that this means that the final line of your output may be a blank line.)</p>