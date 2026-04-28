# [Platinum IV] Horn Clauses - 3636

[문제 링크](https://www.acmicpc.net/problem/3636)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 64 MB

### 통계

제출: 31, 정답: 12, 맞힌 사람: 7, 정답 비율: 33.333%

### 분류

구현, 자료 구조, 그래프 이론, 그리디 알고리즘, 문자열, 집합과 맵, 해시를 사용한 집합과 맵, 파싱

### 문제 설명

<p>Consider some set of boolean variables and a boolean formula. A set of values for the variables is called <em>satisfying</em> if the formula evaluates to true after replacing the variables by the corresponding values. A formula is called <em>unsatisfiable</em> if there exist no such set.</p>

<p>In general, there is no known algorithm finding the satisfying set of values in polynomial time, although it is not yet proved that such algorithm does not exist. The same holds for determining whether the given formula is unsatisfiable. Despite this there are some particular classes of boolean formulae for which the problem of satisfiability and unsatisfiability can be solved in polynomial time. Now we will define one of such classes, and your task will be to create polynomial time algorithm for it.</p>

<p>A <em>Horn clause</em> is a boolean formula, constructed according to the rules below. Let $x$ be a variable from the set. Then a $literal$ is a boolean expression which consists only of the variable by itself or of the variable negation: either $x$ (<em>positive</em> literal) or $\neg{x}$ (<em>negative</em> literal). A <em>clause</em> is a disjunction of one or more literals. A <em>Horn clause</em> is a clause with at most one positive literal.&nbsp;</p>

<p>Consider some Horn clause $\neg n_1 \lor \neg n_2 \lor\ldots\lor\neg n_k \lor p$. It would be more convenient to replace disjunctions with implication: $(n_1{\land}n_2{\land}\ldots{\land}n_k){\Rightarrow}p$.&nbsp;</p>

<p>For consistency, when <em>succedent</em> (the right part of the implication) is empty we will imagine that there is a constant <code>false</code> specified instead; similarly empty <em>antecedent</em> (the left part of the implication) is supposed to be <code>true</code>.&nbsp;</p>

<p>Consider a formula which is a conjunction of one or more Horn clauses. In this particular case, satisfiability and unsatisfiability problems can be solved by polynomial time algorithms. Write a program that would do it.</p>

### 입력

<p>The file consists of formulae, written according to the following BNF. Here $[\langle$expression$\rangle]$ means that $\langle$expression$\rangle$ may be omitted, $\{\langle$expression$\rangle\}$ means that $\langle$expression$\rangle$ may occur zero or more times. Characters in quotes denote themselves.</p>

<pre>
       &lt;char&gt; &rarr; &lsquo;A&rsquo; | &lsquo;B&rsquo; | ... | &lsquo;Z&rsquo;
   &lt;variable&gt; &rarr; &lt;char&gt; {&lt;char&gt;}
&lt;horn-clause&gt; &rarr; &lsquo;(&rsquo; [&lt;variable&gt; {&lsquo;&amp;&rsquo;&lt;variable&gt;}] &lsquo;=&gt;&rsquo;&lt;variable&gt;&lsquo;)&rsquo;
              | &lsquo;(&rsquo;&lt;variable&gt; {&lsquo;&amp;&rsquo;&lt;variable&gt;} &lsquo;=&gt;&rsquo; [&lt;variable&gt;] &lsquo;)&rsquo;
    &lt;formula&gt; &rarr; &lt;horn-clause&gt; {&lsquo;&amp;&rsquo;&lt;horn-clause&gt;}
</pre>

<p>Each formula is specified in a separate line. The total length of the input file does not exceed $20\,000$ characters.</p>

### 출력

<p>Your output must contain either the set of variables with their values that satisfy the corresponding formulae, or word &quot;<code>unsatisfiable</code>&quot;. The variables may be specified in arbitrary order; the value for each variable must be specified exactly once. If there is more than one satisfying set, output any one.</p>