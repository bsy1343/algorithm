# [Platinum I] New Salaries - 16518

[문제 링크](https://www.acmicpc.net/problem/16518)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 20, 정답: 6, 맞힌 사람: 6, 정답 비율: 35.294%

### 분류

(분류 없음)

### 문제 설명

<p>Oh no! As a result of recent elections the &ldquo;Random Laws&rdquo; party took control of the government. This is going to have bad consequences for Mr. Bourgeois&rsquo; company, which just approved the way new salaries will be calculated. The company has N workers and the salary for worker i is going to be determined as a number drawn uniformly from the range [L<sub>i</sub>, R<sub>i</sub>]. Since the company already figured out which workers are the most efficient ones, for each i in [2, N], we know that L<sub>i&minus;1</sub> &le; L<sub>i</sub> and R<sub>i&minus;1</sub> &le; R<sub>i</sub>, but note that as a result of chance, worker i &minus; 1 might still end up with a larger salary than worker i.</p>

<p>The new government introduced a law, where any worker who got a smaller salary than a coworker can sue the company for the amount of their difference. What&rsquo;s even more atrocious is that they can do it for every worker who got a larger salary. So if there were three employees: Alice, Bob, and Charlie, who got salaries of 1, 3, and 7 coins respectively, then employee Bob can sue with regards to Charlie for 4 coins, while Alice can sue for 2 coins because of Bob and for 6 coins because of Charlie. The total amount of damages the company will have to pay is 12.</p>

<p>While the exact salary amounts are not known yet, Mr. Bourgeois would like to find out the expected amount of damages that his company will have to pay. Since the answer can be very big, output the answer divided by N<sup>2</sup>.</p>

### 입력

<p>The first line contains N, (1 &le; N &le; 100 000). The next N lines each contain two real numbers L<sub>i</sub> and R<sub>i</sub> (1 &le; L<sub>i</sub> &le;R<sub>i</sub> &le; 10<sup>6</sup>). All real numbers in the input have at most 6 digits after the decimal point.</p>

### 출력

<p>Output one number: expected payment divided by N<sup>2</sup>. Your answer will be considered correct if its absolute or relative error is less than 10<sup>&minus;4</sup>.</p>