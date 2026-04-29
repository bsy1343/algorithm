# [Platinum IV] Cutting Tofu - 35123

[문제 링크](https://www.acmicpc.net/problem/35123)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 2048 MB

### 통계

제출: 61, 정답: 33, 맞힌 사람: 26, 정답 비율: 55.319%

### 분류

매개 변수 탐색, 수학, 이분 탐색

### 문제 설명

<p>You are preparing miso soup, a favorite among Japanese people, with one of the most popular ingredients, <em>tofu</em>. Tofu is a white cuboid-shaped food that is usually cut into smaller pieces and then put into the soup.</p>

<p>You plan to chop a single block of tofu to make at least a required number of cubes of the same size. You cut the tofu along planes parallel to the faces of the tofu block. Each cut goes all the way through the block, dividing all the pieces it passes through. You should not move the tofu block nor its fragments until tofu cubes are completely cut out.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/35123.%E2%80%85Cutting%E2%80%85Tofu/2adc1d06.jpg" data-original-src="https://boja.mercury.kr/assets/problem/35123-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 372px; height: 259px;"></p>

<p style="text-align: center;">Figure E.1. An example of cutting the tofu</p>

<p>As long as the required number of tofu cubes can be obtained, you want to make cubes as large as possible. You don’t mind leaving excess tofu cubes or leftover fragments, as they can be used for other dishes.</p>

<p>Given the dimensions of the block of tofu (its length, width, and height) in integer multiples of unit length, and the required number of tofu cubes, your task is to find the maximum possible side length of the tofu cubes. Since it can be proven that the answer is a rational number under the given constraints, it should be represented as a reduced fraction.</p>

### 입력

<p>The input contains one or more test cases. The first line of the input contains an integer $t$ ($1 ≤ t ≤ 10^4$), which is the number of test cases. The descriptions of the $t$ test cases follow, each in the following format.</p>

<blockquote>
<p>$a$ $b$ $c$</p>

<p>$k$</p>
</blockquote>

<p>The three integers $a$, $b$, and $c$ represent the length, width, and height of the block of tofu, respectively. They are between $1$ and $10^9$, inclusive. The integer $k$ ($1 ≤ k ≤ 10^9$) represents the required number of tofu cubes.</p>

### 출력

<p>For each test case, output two positive integers $p$ and $q$ in a line, separated by a single space. Here, $p$ and $q$ are mutually prime integers, meaning that $p/q$ is the maximum possible side length of the tofu cubes.</p>