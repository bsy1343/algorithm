# [Gold II] Worms - 4122

[문제 링크](https://www.acmicpc.net/problem/4122)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 5, 정답: 3, 맞힌 사람: 3, 정답 비율: 75.000%

### 분류

다이나믹 프로그래밍

### 문제 설명

<p>Biologists are studying a certain, interesting kind of worm. Each worm can be seen as a line of cells of different types. When a worm is born, it only consists of a single cell. Every day, exactly 1 cell of the entire worm will grow and change into 2 cells. It is rather easy to determine the age of any such worm, since it&rsquo;s simply one less than the number of cells the worm has.</p>

<p>During a worm&rsquo;s growth, a cell does not change into any 2 arbitrary cells; each worm has a set of &ldquo;growth rules&rdquo; (encoded in its DNA) that it obeys. A growth rule can be expressed as A&rarr;BC, where A, B and C are uppercase letters (with letters A-T), representing different types of the worm&rsquo;s cells. The rule A&rarr;BC means that in one day, any single cell A can be grown into the 2 adjacent cells BC, in that order. Note that the rule I&rarr;JK is different from the rule I&rarr;KJ. Different worms may have a different set of growth rules.</p>

<p>The worms have now thrown the scientists for a loop. Due to some unknown reason, some worms have mutated into a new kind of specimen. This new kind of worm has the exact same properties, except that during its growth, multiple parts of its body can grow at the same time. That is, every day any (at least one, at most all) of its cells can grow; each cell that grows will grow into exactly 2 cells (obeying growth rules similar to their older cousins).</p>

<p>As a result of the mutation, it is no longer trivial to determine the age of a worm. In fact, the exact age of some worms cannot be determined. As a simple example, if a worm has growth rules: A&rarr;BC, B&rarr;AC, C&rarr;AB, and the worm&rsquo;s current cell structure is ACAB, the worm can be either 2 or 3 days old (A&rarr;BC&rarr; ACAB, or A&rarr;BC&rarr;ACC&rarr;ACAB). Your task is to find out the youngest possible age of any given mutated worm.&nbsp;</p>

### 입력

<p>There will be multiple worms for examination in the input. Each worm&rsquo;s data set begins with an integer N (1 &lt;= N &lt;= 80), the number of growth rules. The next N lines each contain 3 uppercase letters (with letters A-T), representing a growth rule for the current worm. The 1st cell can grow into (and be replaced by) the 2nd and 3rd cells, in order, during the growth process. That is, the line:</p>

<pre>
ABC</pre>

<p>means A&rarr;BC is a growth rule for the current worm.</p>

<p>The next (and last) line of each worm&rsquo;s data set contains a string of uppercase letters (with letters A-T). This line represents the current cell structure of the worm. Every worm in the input will have at least 1 and at most 50 cells. The last worm will be followed by a line with a single 0.</p>

### 출력

<p>For each worm, if the worm can be grown into the given cell sequence with the given growth rule set (starting with any arbitrary single cell), then print the minimum age, in days, of the worm, as an integer on its own line. If the worm cannot be grown into the given cell sequence with the given rule set (starting with any arbitrary single cell), then simply print the number -1 on its own line. Print no blank lines between outputs.&nbsp;</p>