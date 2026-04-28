# [Platinum I] Elephants - 8172

[문제 링크](https://www.acmicpc.net/problem/8172)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 177, 정답: 66, 맞힌 사람: 57, 정답 비율: 43.182%

### 분류

그리디 알고리즘, 순열 사이클 분할

### 문제 설명

<p>A parade of all elephants is to commence soon at the Byteotian zoo. The zoo employees have encouraged these enormous animals to form a single line, as the manager wills it to be the initial figure of the parade.</p>

<p>Unfortunately, the manager himself came to the parade and did not quite like what he saw - he had intended an entirely different order of the elephants. Therefore he enforced his ordering, claiming the animals would seem most majestic this way, and made the employees reorder the elephants accordingly.</p>

<p>As a pack of moving elephants can wreak havoc, the employees decided to have them rearranged by swapping one pair at a time. Luckily the animals need not stand next to each other in order to swap positions in the line. Making an elephant move, however, is not as easy as it sounds. In fact, the effort one has to put into it is proportional to the animal&#39;s mass. Hence, the effort involved in swapping a pair of elephants of respective masses m<sub>1</sub> and m<sub>2</sub> can be estimated by m<sub>1</sub>+m<sub>2</sub>. What is the minimum effort involved in rearranging the elephants according to manager&#39;s will?</p>

<p>Write a programme that:</p>

<ul>
	<li>reads from the standard input the masses of all elephants from the zoo, along with their current and desired order in the line,</li>
	<li>determines a sequence of elephant swaps leading from the initial to the desired order of animals in the line, such that this sequence minimises the summary effort involved in all the swaps,</li>
	<li>prints out the summary effort on the standard output.</li>
</ul>

### 입력

<p>The first line of the standard input contains a single integer n (2 &le; n &le; 1,000,000) denoting the number of elephants in the zoo. We assume that the elephants are numbered from 1 to n to simplify things. The second line holds n integers mi (100 &le; mi &le; 6,500 dla 1 &le; i &le; n) separated by single spaces and denoting the masses of respective elephants (in kilogrammes).</p>

<p>The third line of input contains n pairwise different integers a<sub>i</sub> (1 &le; a<sub>i</sub> &le; n) separated by single spaces and denoting the numbers of successive elephants in the initial ordering. The fourth line holds n pairwise different integers b<sub>i</sub> (1 &le; b<sub>i</sub> &le; n) separated by single spaces and denoting the numbers of successive elephants in the ordering desired by the zoo manager. You may assume that the sequences (a<sub>i</sub>) and (b<sub>i</sub>) differ.</p>

### 출력

<p>The first and only line of the standard output should contain a single integer denoting the minimum summary effort involved in reordering the elephants from the order represented by the sequence to the one represented by (b<sub>i</sub>).</p>

### 힌트

<p>One of the optimal rearrangements consists of swapping the following pairs of elephants:</p>

<ul>
	<li>2 and 5 - effort involved: 2000+1600=3600, order achieved: 1 4 2 3 6 5,</li>
	<li>3 i 4 - effort involved: 1200+2400=3600, order achieved: 1 3 2 4 6 5,</li>
	<li>1 i 5 - effort involved: 2400+1600=4000, order achieved: 5 3 2 4 6 1, which is the one desired.</li>
</ul>