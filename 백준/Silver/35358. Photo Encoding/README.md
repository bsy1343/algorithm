# [Silver II] Photo Encoding - 35358

[문제 링크](https://www.acmicpc.net/problem/35358)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 15, 정답: 13, 맞힌 사람: 12, 정답 비율: 92.308%

### 분류

구현, 그리디 알고리즘, 브루트포스 알고리즘, 사칙연산, 수학

### 문제 설명

<p>You’ve been tasked with printing some of your old family photos. These photos are ancient – not only are they black and white, but they are also incredibly pixelated! In fact, each photo can be represented as an $n \times n$ grid of pixels, where each pixel is either black or white.</p>

<p>Before you print each photo, you want to buy a frame that perfectly fits an $n \times n$ photo. However, you realize that you do not know $n$ (the dimensions of the photo are unknown)! To make things worse, your computer stores the photo in an unreadable binary format – the only information you can recover about this photo is the list of Manhattan distances of each black pixel from the top-left pixel. The Manhattan distance between two pixels at $(r_1, c_1)$ and $(r_2, c_2)$ is $|r_1 - r_2| + |c_1 - c_2|$.</p>

<p>For example, the $5 \times 5$ photo in Figure 1(a) corresponds to the list $[1, 4, 4]$. You notice that there are multiple possible photos that could correspond to the same list. As an example, the $4 \times 4$ photo shown in Figure 1(b) also corresponds to the list $[1, 4, 4]$.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/35358.%E2%80%85Photo%E2%80%85Encoding/97bd9d8e.png" data-original-src="https://boja.mercury.kr/assets/problem/35358-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 252px; height: 150px;"></p>

<p style="text-align: center;"><b>Figure 1</b>: (a) A $5 \times 5$ photo that corresponds to $[1,4,4]$. (b) A $4 \times 4$ photo that also corresponds to $[1,4,4]$.</p>

<p>With this in mind, you want to be prepared when buying the picture frame. Given a list of Manhattan distances, can you determine the smallest possible $n$ such that there exists an $n \times n$ photo corresponding to this list?</p>

### 입력

<p>The first line of input contains one integer $m$ ($1 \le m \le 1\, 000$), the number of black pixels in the photo.</p>

<p>Each of the next $m$ lines contains a single integer between $0$ and $200$ (inclusive), representing the Manhattan distance from one black pixel to the top-left pixel of the photo. The distances are given in ascending order and are guaranteed to correspond to a valid photo.</p>

### 출력

<p>Output a single integer, the minimum side length $n$ such that there exists an $n \times n$ photo corresponding to the input list.</p>