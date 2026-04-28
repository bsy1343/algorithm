# [Gold IV] Fractions - 16186

[문제 링크](https://www.acmicpc.net/problem/16186)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 259, 정답: 133, 맞힌 사람: 123, 정답 비율: 58.571%

### 분류

수학, 브루트포스 알고리즘, 정수론

### 문제 설명

<p>About 44 days are left before <em>College Scholastic Ability Test</em> is held. This exam aims to measure students&#39; achievement of National Curriculum standards and scholastic ability required for college education. (<a href="http://www.kice.re.kr/sub/info.do?m=0205&amp;s=english">http://www.kice.re.kr/sub/info.do?m=0205&amp;s=english</a>)</p>

<p>One of the subjects covered by this test is Mathematics, which consists of 21 multiple choice questions and 9 short-answer questions. The answer of each short-answer question is guaranteed to be a <em>unique positive integer below 1000</em>, as you can see from the answer sheet below.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/5e1b79e5-2772-4d1a-867f-e85a0c598d0c/-/preview/" /></p>

<p>However, the organizers might want to give students short-answer questions with non-integer answers, such as $2\sqrt{3}$ or $\frac{5}{3}$. Usually, the workaround is to write the answer in a canonical form, and then sum up all the integers inside that form and ask students to write that number instead.</p>

<p>In particular, when the answer is a positive rational number $\frac{a}{b}$, the organizers usually ask students to reduce it and sum up the numerator and the denominator of the reduced fraction. For example, when the answer is $\frac{18}{10}$, the student should reduce it to $\frac{9}{5}$ and write the final answer as $9 + 5 = 14$.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/a16260f1-07cb-41de-b6a5-42714f81cf12/-/preview/" /></p>

<p>However, when the answer is $\frac{521}{500}$, the reduced fraction is also $\frac{521}{500}$, so the student should write the final answer as $521 + 500 = 1021$. But this shouldn&#39;t happen, since all the answers for the short-answer questions are below 1000. To avoid this situation, the organizers should make sure that after reducing the fraction, the sum of the numerator and the denominator shouldn&#39;t exceed $999$. Let&#39;s call such fractions as <em>Suneung Fractions</em>. For example, $\frac{1996}{2}$ and $\frac{18}{10}$ are <em>Suneung fractions</em>, while $\frac{1998}{2}$ and $\frac{521}{500}$ are not.</p>

<p>Suppose that, this year, one of the organizers wrote a problem, and the answer to that problem is $\frac{x}{y}$. Since the problem is not finalized yet, the only thing we know is $A \le x \le B$ and $C \le y \le D$ holds, for given $A, B, C, D$. The organizers want to know, among all the pairs $(x, y)$, how many of $\frac{x}{y}$ is a <em>Suneung fraction</em>. Write a program that counts this number.</p>

### 입력

<p>The first and only line contains four space-separated integers $A, B, C$ and $D$ ($1 \le A \le B \le 10^{12}$, $1 \le C \le D \le 10^{12}$)</p>

### 출력

<p>Print the number of integral pairs $(x,\ y)$ ($A \le x \le B$, $C \le y \le D$), where $\frac{x}{y}$ is a <em>Suneung fraction</em>.</p>