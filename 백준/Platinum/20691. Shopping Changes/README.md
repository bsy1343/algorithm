# [Platinum III] Shopping Changes - 20691

[문제 링크](https://www.acmicpc.net/problem/20691)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 74, 정답: 42, 맞힌 사람: 39, 정답 비율: 56.522%

### 분류

자료 구조, 세그먼트 트리, 누적 합, 값 / 좌표 압축

### 문제 설명

<p>Felix and his M friends are having a shopping frenzy today. From a recent cash transaction, he received a change with N banknotes. Felix would like to slip the banknotes he received into his wallet without changing their order.</p>

<p>For example, let&rsquo;s assume that Felix received a change with N = 4 banknotes in the following order: C<sub>1</sub> C<sub>2</sub> C<sub>3</sub> C<sub>4</sub>. Supposed there are 3 banknotes in Felix&rsquo;s wallet in the following order: W<sub>1</sub> W<sub>2</sub> W<sub>3</sub>, then there are four possible ways to slip the change into Felix&rsquo;s wallet.</p>

<ol>
	<li>Slip the change before the 1<sup>st</sup> banknote. After slipping the change, the banknotes in his wallet are in the following order: C<sub>1</sub> C<sub>2</sub> C<sub>3</sub> C<sub>4</sub> W<sub>1</sub> W<sub>2</sub> W<sub>3</sub>.</li>
	<li>Slip the change between the 1<sup>st</sup> and 2<sup>nd</sup> banknotes. After slipping the change, the banknotes in his wallet are in the following order: W<sub>1</sub> C<sub>1</sub> C<sub>2</sub> C<sub>3</sub> C<sub>4</sub> W<sub>2</sub> W<sub>3</sub>.</li>
	<li>Slip the change between the 2<sup>nd</sup> and 3<sup>rd</sup> banknotes. After slipping the change, the banknotes in his wallet are in the following order: W<sub>1</sub> W<sub>2</sub> C<sub>1</sub> C<sub>2</sub> C<sub>3</sub> C<sub>4</sub> W<sub>3</sub>.</li>
	<li>Slip the change after the 3<sup>rd</sup> banknote. After slipping the change, the banknotes in his wallet are in the following order: W<sub>1</sub> W<sub>2</sub> W<sub>3</sub> C<sub>1</sub> C<sub>2</sub> C<sub>3</sub> C<sub>4</sub>.</li>
</ol>

<p>Being a tidy person, Felix would like the banknotes in his wallet to be as sorted as possible. Therefore, he would like to slip the change in a way that minimizes the inversion count of his wallet after the slip. The <strong>inversion count</strong> of a wallet is the number of pairs of banknotes (x, y) in the wallet such that:</p>

<ul>
	<li>banknote x is closer to the front than banknote y, and</li>
	<li>banknote x has strictly more value than banknote y.</li>
</ul>

<p>Feeling a bit generous today, instead of keeping the change, Felix would like to give them to one of his friends and slip the change into their wallet. The i th friend has a wallet containing L<sub>i</sub> banknotes which values are W<sub>i</sub>[1], W<sub>i</sub>[2], ..., W<sub>i</sub>[L<sub>i</sub>] respectively from the front-most to the back-most of the wallet. Felix would like to give the change to his friend that can minimize the inversion count of their wallet after slipping the change. Therefore, for each of his friends, Felix needs to count the minimum inversion count of their wallet if he slips the change into their wallet.</p>

### 입력

<p>Input begins with a line containing two integers: N M (1 &le; N, M &le; 100 000) representing the number of banknotes in the change and the number of Felix&rsquo;s friends, respectively. The next line contains N integers: C<sub>i</sub> (1 &le; C<sub>i</sub> &le; 10<sup>9</sup>) representing the value of the banknotes in the change. The next M lines each begins with an integer L<sub>i</sub> (1 &le; L<sub>i</sub> &le; 200 000) representing the number of banknotes in the i<sup>th</sup> friend&rsquo;s wallet, followed by L<sub>i</sub> integers: W<sub>i</sub>[j] (1 &le; W<sub>i</sub>[j] &le; 10<sup>9</sup>) representing the value of the banknotes in the wallet. The sum of all L<sub>i</sub> is not more than 200 000.</p>

### 출력

<p>For each friend in the same order as input, output in a line an integer representing the minimum inversion count of their wallet if Felix slips the change into their wallet.</p>