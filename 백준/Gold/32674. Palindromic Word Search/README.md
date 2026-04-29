# [Gold V] Palindromic Word Search - 32674

[문제 링크](https://www.acmicpc.net/problem/32674)

### 성능 요약

시간 제한: 6 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 32, 정답: 15, 맞힌 사람: 15, 정답 비율: 48.387%

### 분류

다이나믹 프로그래밍, 브루트포스 알고리즘

### 문제 설명

<p>Given a rectangular grid of uppercase letters, find a rectangular region of the grid of maximum possible area such that there is a horizontal palindrome spanning some row of the rectangular region and a vertical palindrome spanning some column of the rectangular region. Recall a palindrome is a string that equals its own reversal.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/32674.%E2%80%85Palindromic%E2%80%85Word%E2%80%85Search/d6a7a36c.jpg" data-original-src="https://boja.mercury.kr/assets/problem/32674-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 512px; height: 129px;"></p>

<p style="text-align: center;">Figure 1: Illustration of optimal solutions to the sample inputs. In the shaded subregions, a palindrome spanning an entire row of the region and a palindrome spanning an entire column of the region are highlighted.</p>

### 입력

<p>The first line contains two integers $R$ and $C$ ($1 \leq R,C \leq 500$). Then next $R$ lines describe the grid, each containing exactly $C$ uppercase letters.</p>

### 출력

<p>Output a single integer $A$ indicating the largest area of a rectangular region of the grid such that there is a horizontal palindrome spanning some row and a vertical palindrome spanning some column of the rectangular region.</p>