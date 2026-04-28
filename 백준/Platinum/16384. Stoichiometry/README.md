# [Platinum I] Stoichiometry - 16384

[문제 링크](https://www.acmicpc.net/problem/16384)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 25, 정답: 19, 맞힌 사람: 17, 정답 비율: 73.913%

### 분류

수학, 선형대수학, 가우스 소거법

### 문제 설명

<p>You have landed a lucrative contract with Amalgamated Chemical Manufacturing (ACM), to help their chemists with stoichiometry. Stoichiometry is the calculation of reactants and products in chemical reactions, based on the law of conservation of mass, which states that the total mass of the reactants equals the total mass of the products. The relations among quantities of reactants and products typically form a ratio of positive integers. If the amounts of the separate reactants are known, then the amount of the product can be calculated, and vice-versa. The relationship of reactants to products can be described using a soichiometric equation such as:</p>

<p style="text-align: center;">CH<sub>4</sub> + 2O<sub>2</sub> &rarr; CO<sub>2</sub> + 2H<sub>2</sub>O, (1)</p>

<p>which can be read as: &ldquo;One molecule of CH<sub>4</sub> and two molecules of O<sub>2</sub> yield one molecule of CO<sub>2</sub> and two molecules of H<sub>2</sub>O.&rdquo; The total number of atoms of each element on the left hand side of the stoichiometric equation must match the number of atoms of that element on right hand side. Your task is to write a program that, given an equation of the form:</p>

<p style="text-align: center;">_H<sub>2</sub>O + _CO<sub>2</sub> &rarr; _O<sub>2</sub> + _C<sub>6</sub>H<sub>12</sub>O<sub>6</sub>, (2)</p>

<p>will fill in the blanks to produce a balanced equation. For example, the above equation could be balanced as follows:</p>

<p style="text-align: center;">6H<sub>2</sub>O + 6CO<sub>2</sub> &rarr; 6O<sub>2</sub> + 1C<sub>6</sub>H<sub>12</sub>O<sub>6</sub>. (3)</p>

### 입력

<p>An equation is input in the form of a sequence of M (1 &lt; M &le; 20) lines, one for each molecule in the formula (e.g., H<sub>2</sub>O or CO<sub>2</sub>). Each line m (1 &le; m &le; M) has the following fields:</p>

<p style="text-align: center;">sign<sub>m</sub> N<sub>m</sub> element<sub>m,1</sub> count<sub>m,1</sub> . . . element<sub>m,N<sub>m</sub></sub> count<sub>m,N<sub>m</sub></sub></p>

<p>where sign<sub>m</sub> is either +1 or -1, with a sign of +1 indicating that this molecule appears on the left of the equation, and -1 indicating that it appears on the right. N<sub>m</sub>, where 0 &lt; N<sub>m</sub> &lt; 20, is the number of element/count pairs following on the line. Each element<sub>m,n</sub>, where 1 &le; n &le; N<sub>m</sub>, is an element name consisting of one or two upper or lowercase letters, and each count<sub>m,n</sub> is a positive integer, 1 &le; count<sub>m,n</sub> &le; 12. For example, the element/count pair &ldquo;<code>Fe 2</code>&rdquo; indicates that the molecule contains two atoms of the element Fe (iron). There will be no more than 10 unique elements in a single equation.</p>

<p>Note that an element may be repeated in a given line of input, as in</p>

<pre>
+1 6 C 1 H 5 C 1 O 1 O 1 H 1</pre>

<p>which specifies that at least one molecule of CH<sub>5</sub>COOH appears on the left side of the equation. Note that CH<sub>5</sub>COOH can be written as C<sub>2</sub>H<sub>6</sub>O<sub>2</sub>.</p>

<p>Input ends with a line of the form</p>

<pre>
0 0</pre>

### 출력

<p>The program must output the numbers C<sub>1</sub>, . . . , C<sub>M</sub> (0 &lt; C<sub>i</sub> &le; 1 000), in order, to fill in the blanks in the equation. Each number, C<sub>m</sub> | 1 &le; m &le; M, must be the minimum number for which the equation is balanced (i.e. there is no common factor that could reduce all of the C<sub>m</sub> coefficients). You may assume that every input test case has exactly one valid solution meeting these criteria.</p>