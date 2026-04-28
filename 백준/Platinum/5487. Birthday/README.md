# [Platinum II] Birthday - 5487

[문제 링크](https://www.acmicpc.net/problem/5487)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 64 MB

### 통계

제출: 38, 정답: 13, 맞힌 사람: 11, 정답 비율: 61.111%

### 분류

누적 합, 매개 변수 탐색, 차분 배열 트릭

### 문제 설명

<p>It is Byteman&rsquo;s birthday today. There are n children at his birthday party (including Byteman). The children are numbered from 1 to n. Byteman&rsquo;s parents have prepared a big round table and they have placed n chairs around the table. When the children arrive, they take seats. The child number 1 takes one of the seats. Then the child number 2 takes the seat on the left. Then the child number 3 takes the next seat on the left, and so on. Finally the child number n takes the last free seat, between the children number 1 and n&minus;1 .</p>

<p>Byteman&rsquo;s parents know the children very well and they know that some of the children will be noisy, if they sit too close to each other. Therefore the parents are going to reseat the children in a specific order. Such an order can be described by a permutation p<sub>1</sub>, p<sub>2</sub>,..., p<sub>n</sub> (p<sub>1</sub>, p<sub>2</sub>,..., p<sub>n</sub> are distinct integers from 1 to n) &mdash; child p<sub>1</sub> should sit between p<sub>n</sub> and p<sub>2</sub>, child p<sub>i</sub> (for i = 2 ,3 ,...,n&minus;1 ) should sit between p<sub>i&minus;1</sub> and p<sub>i+1</sub>, and child pn should sit between p<sub>n&minus;1</sub> and p<sub>1</sub>. Please note, that child p1 can sit on the left or on the right from child pn.</p>

<p>To seat all the children in the given order, the parents must move each child around the table to the left or to the right some number of seats. For each child, they must decide how the child will move &mdash; that is, they must choose a direction of movement (left or right) and distance (number of seats). On the given signal, all the children stand up at once, move to the proper places and sit down.</p>

<p>The reseating procedure throws the birthday party into a mess. The mess is equal to the largest distance any child moves. The children can be reseated in many ways. The parents choose one with minimum mess. Help them to find such a way to reseat the children.</p>

<p>Your task is to write a program that:</p>

<ul>
	<li>reads from the standard input the number of the children and the permutation describing the desired order of the children,</li>
	<li>determines the minimum possible mess,</li>
	<li>writes the result to the standard output.</li>
</ul>

### 입력

<p>The first line of standard input contains one integer n (1 &le; n &le; 1 000 000 ). The second line contains n integers p<sub>1</sub>, p<sub>2</sub>,..., p<sub>n</sub>, separated by single spaces. Numbers p<sub>1</sub>, p<sub>2</sub>,..., p<sub>n</sub> form a permutation of the set {1 ,2 ,...,n} describing the desired order of the children. Additionally, in 50% of the test cases, n will not exceed 1 000.</p>

### 출력

<p>The first and the only line of standard output should contain one integer: the minimum possible mess.</p>

### 힌트

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/5487.%E2%80%85Birthday/41ae97c1.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/5487.%E2%80%85Birthday/41ae97c1.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/5487/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:102px; width:401px" /></p>

<p>The left figure shows the initial arrangement of the children. The middle figure shows the result of the following reseating: children number 1 and 2 move one place, children number 3 and 5 move two places, and children number 4 and 6 do not change places. The conditions of arrangement are fulfilled, since 3 sits between 6 and 4, 4 sits between 3 and 5, 5 sits between 4 and 1, 1 sits between 5 and 2, 2 sits between 1 and 6, and 6 sits between 2 and 3. There exists another possible final arrangement of children, depicted in the right figure. In both cases no child moves more than two seats.</p>