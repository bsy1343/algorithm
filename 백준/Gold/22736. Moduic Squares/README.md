# [Gold V] Moduic Squares - 22736

[문제 링크](https://www.acmicpc.net/problem/22736)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 24, 정답: 14, 맞힌 사람: 13, 정답 비율: 59.091%

### 분류

브루트포스 알고리즘, 백트래킹

### 문제 설명

<p>Have you ever heard of Moduic Squares? They are like 3 &times; 3 Magic Squares, but each of them has one extra cell called a moduic cell. Hence a Moduic Square has the following form.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/22736.%E2%80%85Moduic%E2%80%85Squares/3ad1be91.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/22736.%E2%80%85Moduic%E2%80%85Squares/3ad1be91.png" data-original-src="https://upload.acmicpc.net/cd4dbd34-f3bc-478f-bf5a-09d1aa14210a/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 170px; height: 104px;" /></p>

<p style="text-align: center;">Figure 1: A Moduic Square</p>

<p>Each of cells labeled from A to J contains one number from 1 to 10, where no two cells contain the same number. The sums of three numbers in the same rows, in the same columns, and in the diagonals in the 3 &times; 3 cells must be congruent modulo the number in the moduic cell. Here is an example Moduic Square:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/22736.%E2%80%85Moduic%E2%80%85Squares/8a1a772c.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/22736.%E2%80%85Moduic%E2%80%85Squares/8a1a772c.png" data-original-src="https://upload.acmicpc.net/6f9155b3-e580-4e8f-bd70-4e1e68a48c79/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 170px; height: 104px;" /></p>

<p style="text-align: center;">Figure 2: An example Moduic Square</p>

<p>You can easily see that all the sums are congruent to 0 modulo 5.</p>

<p>Now, we can consider interesting puzzles in which we complete Moduic Squares with partially filled cells. For example, we can complete the following square by filling 4 into the empty cell on the left and 9 on the right. Alternatively, we can also complete the square by filling 9 on the left and 4 on the right. So this puzzle has two possible solutions.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/22736.%E2%80%85Moduic%E2%80%85Squares/826d4a0a.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/22736.%E2%80%85Moduic%E2%80%85Squares/826d4a0a.png" data-original-src="https://upload.acmicpc.net/45c7dbc3-4e75-49ef-b8e8-a6b105f9cb9f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 170px; height: 104px;" /></p>

<p style="text-align: center;">Figure 3: A Moduic Square as a puzzle</p>

<p>Your task is to write a program that determines the number of solutions for each given puzzle.</p>

### 입력

<p>The input contains multiple test cases. Each test case is specified on a single line made of 10 integers that represent cells A, B, C, D, E, F, G, H, I, and J as shown in the first figure of the problem statement. Positive integer means that the corresponding cell is already filled with the integer. Zero means that the corresponding cell is left empty.</p>

<p>The end of input is identified with a line containing ten of -1&rsquo;s. This is not part of test cases.</p>

### 출력

<p>For each test case, output a single integer indicating the number of solutions on a line. There may be cases with no solutions, in which you should output 0 as the number.</p>