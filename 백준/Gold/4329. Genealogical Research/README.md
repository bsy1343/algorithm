# [Gold IV] Genealogical Research - 4329

[문제 링크](https://www.acmicpc.net/problem/4329)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 27, 정답: 19, 맞힌 사람: 10, 정답 비율: 66.667%

### 분류

자료 구조, 해시를 사용한 집합과 맵, 구현, 파싱, 재귀, 문자열, 집합과 맵

### 문제 설명

<p>These days, everyone seems to be exploring their ancestry. This effort is supported by family history software, now marketed by a number of vendors. Unfortunately this software is expensive and runs only on the McDoze X operating system. You are to write an open-source equivalent.</p>

### 입력

<p>Your program accepts a series of commands, one per line. The commands are described by the following syntax:</p>

<pre>
   <em>command</em> ::= <em>birth</em>
           ::= <em>death</em>
           ::= <em>ancestors</em>
           ::= <em>descendants</em> 
           ::= QUIT
   
   <em>birth</em> ::= BIRTH <em>child</em>: <em>date</em>: <em>mother</em>: <em>father</em>

   <em>death</em> ::= DEATH <em>person</em>: <em>date</em>

   <em>ancestors</em> ::= ANCESTORS <em>person</em>

   <em>descendants</em> ::= DESCENDANTS <em>person</em>
   
   <em>child</em> ::= <em>name</em>

   <em>mother</em> ::= <em>name</em>

   <em>father</em> ::= <em>name</em>

   <em>person</em> ::= <em>name</em>

   <em>date</em> ::= <em>name</em>

   <em>name</em> ::= <em>&lt;&lt;any sequence of characters not beginning or ending
                       with a space or containing a colon&gt;&gt;</em>
</pre>

<p>Spaces in the input are ignored except where they appear within&nbsp;<em>name</em>. The BIRTH and DEATH commands record the birth and death of an individual. You may assume that each individual has a unique name. The ANCESTORS and DESCENDANTS commands are queries: they print a family tree or a reverse family tree for the named person, using the BIRTH and DEATH information entered by previous commands. The QUIT command indicates the end of input.</p>

<p>The BIRTH, DEATH, and QUIT commands have no output. For each ANCESTORS (DESCENDANTS) command, print the following information:</p>

<ul>
	<li>1. Print a line containing &quot;ANCESTORS of&quot; (&quot;DESCENDANTS of&quot;) followed by the person&#39;s name</li>
	<li>2. Indented 2 spaces from the previous line, print the person&#39;s first parent (child) in alphabetical order, followed by the parent&#39;s (child&#39;s) birth date, followed by a space, followed by a hyphen, and, if the parent (child) has died, another space and the date of death. If there is no birth record for the parent (child), print the name alone.</li>
	<li>3. Print the ancestry (descendant) information for the parent (child), indented another 2 spaces, using these same steps (i.e. steps 2-4).</li>
	<li>4. Repeat steps 2-4 for the remaining parent (children). Indentation should be the same as for the previous parent (child).</li>
</ul>

<p>Leave an empty line between the output sequences for successive commands.</p>

<p>You may assume that no input line exceeds 100 characters, and that there are not more than 250 lines of input. You may assume that DEATH, ANCESTORS, and DESCENDANTS commands refer to a name for which a BIRTH command has previously been given. QUIT appears only as the last line of input.</p>

### 출력

