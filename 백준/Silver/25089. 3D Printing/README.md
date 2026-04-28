# [Silver IV] 3D Printing - 25089

[문제 링크](https://www.acmicpc.net/problem/25089)

### 성능 요약

시간 제한: 5 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 173, 정답: 140, 맞힌 사람: 126, 정답 비율: 80.255%

### 분류

그리디 알고리즘

### 문제 설명

<p>You are part of the executive committee of the Database Design Day festivities. You are in charge of promotions and want to print three D&#39;s to create a logo of the contest. You can choose any color you want to print them, but all three have to be printed in the same color.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/25089.%E2%80%853D%E2%80%85Printing/105fd5ef.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/25089.%E2%80%853D%E2%80%85Printing/105fd5ef.png" data-original-src="https://upload.acmicpc.net/0f521e22-e0c1-4e7e-be61-4b81fb993df3/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 235px; height: 100px;" /></p>

<p>You were given three printers and will use each one to print one of the D&#39;s. All printers use ink from $4$ individual cartridges of different colors (cyan, magenta, yellow, and black) to form any color. For these printers, a color is uniquely defined by $4$ non-negative integers $c$, $m$, $y$, and $k$, which indicate the number of ink units of cyan, magenta, yellow, and black ink (respectively) needed to make the color.</p>

<p>The total amount of ink needed to print a single D is exactly $10^6$ units. For example, printing a D in pure yellow would use $10^6$ units of yellow ink and $0$ from all others. Printing a D in the Code Jam red uses $0$ units of cyan ink, $500000$ units of magenta ink, $450000$ units of yellow ink, and $50000$ units of black ink.</p>

<p>To print a color, a printer must have at least the required amount of ink for each of its $4$ color cartridges. Given the number of units of ink each printer has in each cartridge, output any color, defined as $4$ non-negative integers that add up to $10^6$, such that all three printers have enough ink to print it.</p>

### 입력

<p>The first line of the input gives the number of test cases, $T$. $T$ test cases follow. Each test case consists of $3$ lines. The $i$-th line of a test case contains $4$ integers $C_i$, $M_i$, $Y_i$, and $K_i$, representing the number of ink units in the $i$-th printer&#39;s cartridge for the colors cyan, magenta, yellow, and black, respectively.</p>

### 출력

<p>For each test case, output one line containing <code>Case #x: r</code>, where $x$ is the test case number (starting from 1) and $r$ is <code>IMPOSSIBLE</code> if there is no color that can be printed by all $3$ printers. Otherwise, $r$ must be equal to &quot;$c$ $m$ $y$ $k$&quot; where $c$, $m$, $y$, and $k$ are non-negative integers that add up to $10^6$ and $c&le;C_i$, $m&le;M_i$, $y&le;Y_i$, and $k&le;K_i$, for all $i$.</p>

<p>If there are multiple solutions, you may output any one of them.</p>

### 힌트

<p>Sample Case #1 is the image provided above. The proposed color is using up all of the ink in the cyan, magenta, and yellow cartridges of the first printer and all of the ink in the black cartridge of the last printer. This means that no additional unit of ink could be used from any of the $4$ ink colors, so the given sample output is the only possible output for this case.</p>

<p>In Sample Case #2, magenta is the only color that both the first and second printers have, so our only chance would be to use $10^6$ units of magenta. Unfortunately, the third printer does not have quite enough, making this case impossible.</p>

<p>In Sample Case #3, other correct outputs are: &quot;<code>400000 100000 100000 400000</code>&quot;, &quot;<code>300000 0 0 700000</code>&quot;, and &quot;<code>350000 140000 160000 350000</code>&quot;, among lots of others. Notice that &quot;<code>300000 140000 160000 700000</code>&quot; would not be a valid answer because, even though there is enough ink in all printers to do that, the total number of ink units must be exactly $10^6$.</p>