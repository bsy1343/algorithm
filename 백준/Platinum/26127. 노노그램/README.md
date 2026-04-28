# [Platinum V] 노노그램 - 26127

[문제 링크](https://www.acmicpc.net/problem/26127)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 144, 정답: 55, 맞힌 사람: 44, 정답 비율: 40.367%

### 분류

다이나믹 프로그래밍, 누적 합

### 문제 설명

<p>노노그램은 직사각형 격자를 규칙에 맞게 색칠하는 퍼즐 게임이다. 격자의 각 행과 열에는 양의 정수의 배열이 힌트로 주어지는데, 이는 각 행 또는 열에서 연속한 칠해진 칸의 배열을 나타낸다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/26127.%E2%80%85%EB%85%B8%EB%85%B8%EA%B7%B8%EB%9E%A8/5b29e864.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/26127.%E2%80%85%EB%85%B8%EB%85%B8%EA%B7%B8%EB%9E%A8/5b29e864.png" data-original-src="https://upload.acmicpc.net/9d46e134-7699-434a-89fa-73f51b358770/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="max-width: 100%; width: 300px;" /> <img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/26127.%E2%80%85%EB%85%B8%EB%85%B8%EA%B7%B8%EB%9E%A8/f77ba871.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/26127.%E2%80%85%EB%85%B8%EB%85%B8%EA%B7%B8%EB%9E%A8/f77ba871.png" data-original-src="https://upload.acmicpc.net/b2891056-e5a8-4ab9-a2ad-0ee75aa06a2a/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="max-width: 100%; width: 300px;" /></p>

<p>예를 들어 위의 왼쪽 그림을 보자. 4행에 있는 힌트 $[10]$은 해당 행에서 연속한 $10$칸을 색칠해야 함을 나타낸다. 색칠할 $10$칸은 아무 곳에서나 시작해도 되고, 그 외의 칸은 비워 놔야 한다.</p>

<p>이번에는 9행에 있는 힌트 $[3,4,4]$에 주목하자. 이는 해당 행에서 순서대로 $3$칸, $4$칸, $4$칸의 연속한 칸을 색칠해야 함을 나타낸다. 힌트의 순서와 칠해진 칸의 순서는 일치해야 하며, 각 연속한 칠해진 칸 사이에는 하나 이상의 빈 칸이 있어야 한다.</p>

<p>이해를 돕기 위해 위의 오른쪽 그림에는 4행과 9행만 남겨 두었다.</p>

<p>윤이는 노노그램을 풀면서 반드시 색칠해야 하는 칸과 비워 둬야 하는 칸 몇 개를 알아냈지만, 더 이상 진행이 되지 않아 애를 쓰고 있다. 방법을 고민하던 윤이는 문득 어떤 행 하나에 대해서 조건에 맞게 색칠하는 경우의 수가 궁금해졌다. 행의 힌트와 행의 각 칸에 대해 윤이가 알아낸 정보가 주어지면, 해당 행을 조건에 맞게 색칠하는 경우의 수를 구하시오.</p>

### 입력

<p>첫 번째 줄에 행의 길이 $N$과 힌트 배열의 길이 $K$가 공백으로 구분되어 주어진다. ($1\le K\le N\le 3\ 000$)</p>

<p>두 번째 줄에 힌트를 나타내는 $K$개의 정수가 공백으로 구분되어 주어진다. 각 정수는 $1$ 이상 $N$ 이하이다.</p>

<p>세 번째 줄에 행의 정보를 나타내는 길이 $N$의 문자열이 주어진다. 문자열은 <code>&lsquo;.&rsquo;</code>, <code>&lsquo;O&rsquo;</code>, 또는 <code>&lsquo;X&rsquo;</code>로 이루어져 있으며, <code>&lsquo;.&rsquo;</code>은 아직 정보를 얻지 못한 빈 칸, <code>&lsquo;O&rsquo;</code>는 반드시 색칠해야 하는 칸, <code>&lsquo;X&rsquo;</code>는 반드시 비워 둬야 하는 칸을 나타낸다.</p>

### 출력

<p>조건에 맞게 행을 색칠하는 경우의 수를 $10^9+7$로 나눈 나머지를 출력한다.</p>

### 힌트

<p>본문에 제공된 노노그램의 출처는 이곳이다. https://www.nonograms.org/nonograms/i/28098</p>