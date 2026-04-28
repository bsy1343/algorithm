# [Silver III] Impartial Offerings - 24035

[문제 링크](https://www.acmicpc.net/problem/24035)

### 성능 요약

시간 제한: 10 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 82, 정답: 68, 맞힌 사람: 63, 정답 비율: 81.818%

### 분류

그리디 알고리즘, 정렬

### 문제 설명

<p>Aroha is a big animal lover, so she spends some free time taking care of many of her loved ones&#39; pets. She likes to offer them treats, but wants to do that in an impartial way.</p>

<p>Aroha decided that it was logical for pets of the same size to get the same amount of treats and for larger pets to get strictly more treats than smaller ones. For example, if she has $4$&nbsp;pets with her of sizes&nbsp;$10,20,10$, and&nbsp;$25$, she could offer&nbsp;$2$&nbsp;treats to each pet of size&nbsp;$10$,&nbsp;$3$&nbsp;treats to the pet of size&nbsp;$20$, and&nbsp;$5$&nbsp;treats to the pet of size&nbsp;$25$. This requires her to buy a total of&nbsp;$2+3+2+5=12$&nbsp;treats. However, she can offer treats to all&nbsp;$4$&nbsp;pets and comply with her own rules with a total of just&nbsp;$7$&nbsp;treats by offering&nbsp;$1$&nbsp;each to the pets of size&nbsp;$10$,&nbsp;$2$&nbsp;to the pet of size&nbsp;$20$, and&nbsp;$3$&nbsp;to the pet of size&nbsp;$25$.</p>

<p>Help Aroha plan her next pet day. Given the sizes of all pets that will accompany her, compute the minimum number of treats she needs to buy to be able to offer at least one treat to all pets while complying with her impartiality rules.</p>

### 입력

<p>The first line of the input gives the number of test cases, $T$.&nbsp;$T$&nbsp;test cases follow. Each test case consists of two lines. The first line of a test case contains a single integer&nbsp;$N$, the number of pets in Aroha&#39;s next pet day. The second line of a test case contains&nbsp;$N$&nbsp;integers&nbsp;$S_1,S_2,\cdots ,S_N$, representing the sizes of each pet.</p>

### 출력

<p>For each test case, output one line containing&nbsp;<code>Case #x:&nbsp;y</code>, where $x$&nbsp;is the test case number (starting from 1) and&nbsp;$y$&nbsp;is the minimum number of treats she needs to buy to be able to offer at least one treat to all pets while complying with her impartiality rules.</p>

### 제한

<ul>
	<li>$1&le;T&le;100$.</li>
	<li>$1&le;S_i&le;100$, for all $i$.</li>
</ul>

### 힌트

<p>Sample Case #1 is the case explained above.</p>

<p>In Sample Case #2, all pets are of the same size, so Aroha must offer them all the same amount of treats. The minimum total is attained by offering each pet a single treat.</p>

<p>In Sample Case #3, both pets are of different size so they need a different amount of treats each. Buying less than&nbsp;$2$&nbsp;treats is not enough to give treats to both pets. Buying&nbsp;$2$&nbsp;treats and making sure both pets get something would force Aroha to give both pets the same amount, despite them having different size. Using&nbsp;$3$&nbsp;treats Aroha can give&nbsp;11&nbsp;to the small pet and&nbsp;$2$&nbsp;to the big pet and thus comply with all her rules.</p>