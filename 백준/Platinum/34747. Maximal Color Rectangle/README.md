# [Platinum III] Maximal Color Rectangle - 34747

[문제 링크](https://www.acmicpc.net/problem/34747)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 38, 정답: 21, 맞힌 사람: 17, 정답 비율: 51.515%

### 분류

누적 합, 스택, 자료 구조

### 문제 설명

<p>You are given an $N \times N$ grid $A$ where each cell contains an integer color ID $A_{ij}$. Your task is to find the largest axis-aligned rectangle whose cells all have the same color, and report its area.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/34747.%E2%80%85Maximal%E2%80%85Color%E2%80%85Rectangle/63906089.png" data-original-src="https://boja.mercury.kr/assets/problem/34747-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; height: 347px;"></p>

<p>In this figure, the maximal area satisfying the problem’s conditions is $6$. Note that <b><strong>rectangle must be axis-aligned and contiguous </strong></b>in rows and columns.</p>

### 입력

<p>The first line contains a single integer $N$, representing the size of the grid $A$. $(1 \leq N \leq 2\,000)$</p>

<p>The next $N$ lines each contain $N$ integers, integer denotes the color ID $A_{ij}$. $(-1\,000\,000 \leq A_{ij} \leq 1\,000\,000)$</p>

### 출력

<p>Print a single integer: the maximal area satisfying the problem’s conditions.</p>