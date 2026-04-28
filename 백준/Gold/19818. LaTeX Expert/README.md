# [Gold V] LaTeX Expert - 19818

[문제 링크](https://www.acmicpc.net/problem/19818)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 161, 정답: 54, 맞힌 사람: 35, 정답 비율: 36.458%

### 분류

구현, 문자열, 집합과 맵, 파싱, 정규 표현식

### 문제 설명

<p>Regina is finishing her graduation work. She asks Grigory who is LaTeX expert to help her with layout.</p>

<p>Making layout is easy for Grigory, but he has some problems with bibliography rendering. Due to graduation work design requirements, references in bibliography must be placed in the same order as they are placed in the text of the work. Each reference has exactly one occurrence in Regina&#39;s work.</p>

<p>For placing reference on some source Grigory uses <code>\cite{&lt;reference&gt;}</code> construction, where <code>&lt;reference&gt;</code> is the name of the reference. An example of a text that contains three references is shown below.</p>

<pre>
The most famous characters of Pushkin&#39;s works are Onegin \cite{onegin},
Dubrovsky \cite{dubrovsky} and Tsar Saltan \cite{saltan}.</pre>

<p>To make the bibliography, Grigory needs to place the following construction after the text of the work:</p>

<pre>
\begin{thebibliography}{99}
\bibitem{onegin} A.S.Pushkin. Eugene Onegin. 1831.
\bibitem{dubrovsky} A.S.Pushkin. Dubrovsky. 1841.
\bibitem{saltan} A.S.Pushkin. The Tale of Tsar Saltan. 1832.
\end{thebibliography}
</pre>

<p>Here <code>99</code> is the maximal number of references and reference description is written after <code>\bibitem{&lt;reference&gt;}</code> construction.</p>

<p>Text is quite large and Grigory is quite lazy, so he doesn&#39;t want to check the order of references. Therefore he asks you to write a program that can analyze the text and the bibliography. If the bibliography is incorrect, your program must print the correct new one.</p>

### 입력

<p>Input contains the text of the work that consists of lowercase and uppercase English letters, ends of lines, spaces, &lt;&lt;<code>.</code>&gt;&gt;, &lt;&lt;<code>,</code>&gt;&gt;, &lt;&lt;<code>&#39;</code>&gt;&gt; (ASCII code 39) characters and <code>\cite{&lt;reference&gt;}</code> constructions. Here <code>&lt;reference&gt;</code> is a nonempty string of lowercase English letters that has the length at most $100$. ASCII code of &lt;&lt;<code>\textbackslash</code>&gt;&gt; character is 92.</p>

<p>Each <code>\cite{&lt;reference&gt;}</code> construction starts at a new line or after a space character. The text of the work can contain empty lines.</p>

<p>The following line after the text is equal to <code>\begin{thebibliography}{99}</code>. Each of the following lines contains a description of a source in the described format. Description consists of the same characters as the text of work. Length of each description isn&#39;t greater than $100$ characters. The following line after the bibliography is <code>\end{thebibliography}{99}</code>.</p>

<p>It&#39;s guaranteed that:</p>

<ul>
	<li>The total number of references is not greater than 99.</li>
	<li>There is at least one reference in the text.</li>
	<li>If the text contains some reference, the bibliography contains that reference too.</li>
	<li>The number of <code>\cite{&lt;reference&gt;}</code> constructions in the text is the same as the number of <code>\bibitem{&lt;reference&gt;}</code> constructions in the bibliography.</li>
	<li>The references in the text are different.</li>
	<li>The total number of lines in the input isn&#39;t greater than $10^5$.</li>
	<li>The sum of lengths of the lines in the text isn&#39;t greater than $10^5$.</li>
	<li>Input doesn&#39;t contain two consecutive space characters. The first and the last characters of each line aren&#39;t spaces.</li>
</ul>

### 출력

<p>Print <code>Correct</code> if the bibliography from the input is correct and <code>Incorrect</code> otherwise.</p>

<p>In the second case print the correct bibliography in the required format then. The source descriptions must be the same as defined in input.</p>