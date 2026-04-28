# [Platinum II] Beth Tableaux - 7460

[문제 링크](https://www.acmicpc.net/problem/7460)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 64 MB

### 통계

제출: 5, 정답: 4, 맞힌 사람: 1, 정답 비율: 50.000%

### 분류

구현, 문자열, 파싱

### 문제 설명

<p>Your program has to check the validity of a given logical formula. If the formula $E$ is invalid (i.e. evaluates to $\mathbf{0}$ for some assignment of boolean values to the variables), you&rsquo;ll also have to find such an assignment of values.</p>

<p>Usually such tasks are solved just by processing all possible assignments of values to the variables occurring in $E$; if there are $k$ such variables, this requires considering $2^k$ such assignments. Of course, this is almost impossible for large values of $k$. Besides, this process is much different from the way people usually check (i.e. prove) logical formulae.</p>

<p>In this task you are to implement a natural way of checking validity of logical formulae based on the so-called <em>Beth tableaux</em>. This way of checking validity of formulae models to a certain extent the process of finding proofs or contrary instances used by humans, at least, a short rigorous proof can be usually obtained quite immediately from constructed Beth tableaux.</p>

<p>Let us fix the syntax of logical formulae considered:</p>

<ul>
	<li>Constants $\mathbf{1}$ and $\mathbf{0}$;</li>
	<li>Variables &mdash; letters from A to Z and from a to z;</li>
	<li>Parentheses &mdash; if $E$ is a formula, then $(E)$ is another;</li>
	<li>Negation &mdash; $\neg E$ is a formula for any formula $E$;</li>
	<li>Conjunction &mdash; $E_1 \wedge E_2 \wedge \cdots \wedge E_n$. Note that the conjunction is evaluated from left to right: $E_1 \wedge E_2 \wedge E_3 = (E_1 \wedge E_2) \wedge E_3$.</li>
	<li>Disjunction &mdash; $E_1 \vee E_2 \vee \cdots \vee E_n$. The same remark applies.</li>
	<li>Implication &mdash; $E_1 \Rightarrow E_2$. Unlike the previous two operations it is evaluated from right to left: $E_1 \Rightarrow E_2 \Rightarrow E_3$ means $E_1 \Rightarrow (E_2 \Rightarrow E_3)$.</li>
	<li>Equivalence &mdash; $E_1 \equiv E_2 \equiv \cdots \equiv E_n$. This expression is by definition computed as follows: $(E_1 \equiv E_2) \wedge (E_2 \equiv E_3) \wedge \cdots \wedge (E_{n-1} \equiv E_n)$.</li>
</ul>

<p>The operations are listed from the highest priority to the lowest.</p>

<p>Let us define the <em>principal operation</em> of a compound formula $E$ as the operation in $E$ which is performed last (of course, formulae consisting just of one constant or variable have no principal operation). Also let us suppose that our formula does not contain equivalence operations since we can always replace $E_1 \equiv E_2$with $(E_1 \Rightarrow E_2) \wedge (E_2 \Rightarrow E_1)$.</p>

<p>Now we define a <em>Beth tableau</em> to be a table with two columns with some formulae written in them. The order formulae are written in the columns and the number of times a formula appears in a column is irrelevant: we can assume for example that all formulae in a column are different and that they are ordered lexicographically.</p>

<p>Informally the left column corresponds to formulae which we want to be true and the right column to those which we want to be false; the whole process can be considered then as an attempt to produce a contrary instance to given formula $E$. A Beth tableau is said to be <em>contradictory</em> if some formula $E_*$ occurs in both columns of this tableau, or if $\mathbf{0}$ occurs in the left column, or if $\mathbf{1}$ occurs in the right column.</p>

<p>At every step of the process we have a collection of Beth tableaux. We start with a single Beth tableau with empty left column and the right column containing just the given formula $E$. A step of the process consists in choosing a compound formula $C$ from a non-contradictory Beth tableau from the collection and applying a rule chosen by the principal operation of $C$ and by the column (left or right) in which $C$ is situated. As a result some formulae are added to the left or right columns of this Beth tableau (or both); of course, if these formulae that we want to add are already there the Beth tableau won&rsquo;t change, so in this case we say that the corresponding rule is <em>inapplicable</em>. There are also some rules that make&nbsp;two copies of the original Beth tableau and add some formulae into one of these copies and some other into the second one. In this case we say that the rule is inapplicable if both Beth tableaux thus obtained were already in the collection before applying the rule.</p>

<p>The process stops when no rule is applicable. Note that all formulae occurring in all Beth tableaux constructed will be sub-formulae of the original formula, so there are only finitely many Beth tableaux that can be obtained and thus only finitely many collections of Beth tableaux can be obtained. Therefore the process will have to stop at some point. If at this point all Beth tableaux in the collection are contradictory, the original formula $E$ has been proved to be valid. Otherwise if $\tau$ is a non-contradictory Beth tableau from the collection, any variable $x$ occurring in $E$ must occur in exactly one column of $\tau$ (it cannot occur in both columns since $\tau$ is not contradictory; it must occur in at least one column since otherwise a rule would be applicable to the shortest formula in $\tau$ containing $x$). Then let us assign $\mathbf{1}$ to all the variables from the left column and $\mathbf{0}$ to the variables from the right column of $\tau$. This would give us a contrary instance to $E$, i.e. an assignment of values to variables for which our original formula $E$ evaluates to $\mathbf{0}$.</p>

<p>Now let us list all possible rules. It has been already explained that a rule is defined by the principal operation $*$ of a formula $C$ and the column (left or right) in which $C$ was found. We shall label these rules by $*_l$ and $*_r$ where $*$ is the operation (one of $\wedge$, $\vee$, $\Rightarrow$ or $\neg$). If $*$ is binary, we shall assume that $C = A * B$; otherwise we assume $C = \neg A$.</p>

<p>Let us list the rules that do not increase the number of tableaux (i.e. they just add some formulae to the columns of selected Beth tableau):</p>

<p>$$\wedge_l : \left. \begin{matrix} A \wedge B &amp;\\ \cdots &amp;\\ (A) &amp; \\ (B) &amp; \end{matrix} \right\vert \begin{matrix} &amp; \cdots &amp; \\ &amp; &nbsp;&amp; \\ &amp; &nbsp;&amp; \\ &amp; &nbsp;&amp; \end{matrix} ~~~ \vee_r : \begin{matrix} \cdots &amp; \\ &amp; &nbsp;&nbsp;\\ &amp; &nbsp;&nbsp;\\ &amp; &nbsp;&nbsp;\end{matrix} \left\vert \begin{matrix} &amp; A \wedge B &amp; \\ &amp; \cdots &amp; \\ &amp; (A) &amp; \\ &amp; (B) &amp; \end{matrix} \right. ~~~ \Rightarrow_r : \begin{matrix} &amp; \cdots &amp; \\ &amp; (A) &amp; &nbsp;\\ &amp; &amp; &nbsp;\end{matrix} \left\vert \begin{matrix} &amp; A \Rightarrow B \\ &amp; \cdots \\ &nbsp;&amp; (B) \end{matrix} \right.$$</p>

<p>$$\neg_l : \begin{matrix} &amp; \neg A &amp; \\ &amp; \cdots &amp; &nbsp;\end{matrix} \left\vert \begin{matrix} &amp; \cdots &amp; \\ &amp; (A) &amp; \end{matrix} \right. ~~~ \neg_r : \begin{matrix} &amp; \cdots &amp; \\ &amp; (A)&amp; &nbsp;\end{matrix} \left\vert \begin{matrix} &amp; \neg A&amp; \\ &amp; \cdots &amp; \end{matrix} \right.$$</p>

<p>This means the following: for example, if we apply the rule $\Rightarrow_r$ to the formula $A \Rightarrow B$ in the right column of a Beth tableau, then we have to add formula $A$ to the left column and $B$ to the right column of this tableau.</p>

<p>The next rules produce two Beth tableaux from one. A similar notation is used, but two Beth tableaux are shown for each rule:</p>

<p>$$\wedge_r : \left. \begin{matrix} \cdots &amp;\\ &amp;\\ &nbsp;&amp; &nbsp;\end{matrix} \right\vert \begin{matrix} &amp; A \wedge B &amp; \\ &amp; \cdots&nbsp;&amp; \\ &amp; (A)&nbsp;&amp; &nbsp;\end{matrix} ~ \left. \begin{matrix} \cdots &amp;\\ &amp;\\ &nbsp;&amp; &nbsp;\end{matrix} \right\vert \begin{matrix} &amp; A \wedge B &amp; \\ &amp; \cdots&nbsp;&amp; \\ &amp; (B)&nbsp;&amp; &nbsp;\end{matrix} ~~~ \vee_l : \left. \begin{matrix} A \vee B &amp; \\ \cdots &amp; \\ &nbsp;(A) &amp; \end{matrix} \right\vert \begin{matrix} &amp; \cdots &amp; \\ &amp; &amp; \\ &amp; &nbsp;&amp; &nbsp;\end{matrix} ~ \left. \begin{matrix} A \vee B &amp; \\ \cdots &amp; \\ &nbsp;(B) &amp; \end{matrix} \right\vert \begin{matrix} &amp; \cdots &amp; \\ &amp; &amp; \\ &amp; &nbsp;&amp; &nbsp;\end{matrix} $$</p>

<p>$$\Rightarrow_l &nbsp;: \left. \begin{matrix} A \Rightarrow B &amp;\\ \cdots &amp; \\ &nbsp;&amp; &nbsp;\end{matrix} \right\vert \begin{matrix} &amp; \cdots &amp; \\ &amp; (A)&nbsp;&amp; \\ &amp; &nbsp;&amp; &nbsp;\end{matrix} ~ \left. \begin{matrix} A \Rightarrow B&amp;\\ \cdots &amp;\\ (B) &amp; &nbsp;\end{matrix} \right\vert \begin{matrix} &amp; \cdots &amp; \\ &amp; &amp; \\ &amp; &amp; &nbsp;\end{matrix}$$</p>

<p>These three rules are interpreted as follows: if we apply for example $\vee_l$ to the formula $A \vee B$ in the left column of a Beth tableau $\tau$, we have to replace $\tau$ with two copies of itself $\tau &#39;$ and $\tau &#39; &#39;$, and then add $A$ to the left column of $\tau &#39;$ and $B$ to the left column of $\tau &#39; &#39;$.</p>

### 입력

<p>The only line of input contains the formula represented as a string consisting of tokens &lsquo;<code>0</code>&rsquo;, &lsquo;<code>1</code>&rsquo;, &lsquo;<code>A</code>&rsquo;. . . &lsquo;<code>Z</code>&rsquo;, &lsquo;<code>a</code>&rsquo;. . . &lsquo;<code>z</code>&rsquo;, &lsquo;<code>(</code>&rsquo;, &lsquo;<code>)</code>&rsquo;, &lsquo;<code>~</code>&rsquo;, &lsquo;<code>&amp;</code>&rsquo;, &lsquo;<code>|</code>&rsquo;, &lsquo;<code>=&gt;</code>&rsquo;, &lsquo;<code>=</code>&rsquo;. The last five tokens stand for $\neg$, $\wedge$, $\vee$ , $\Rightarrow$ and $\equiv$ respectively. Tokens can be separated by an arbitrary number of spaces. The line will contain at most 1 000 characters. The formula in the file will be syntactically correct.</p>

### 출력

<p>The output file must contain exactly one line. Output just &ldquo;<code>true</code>&rdquo; if the formula is valid or &ldquo;<code>false</code>&rdquo; followed by an assignment of variables that invalidates the formula. List the variables in lexicographical order. Adhere to the sample output as strictly as possible.</p>