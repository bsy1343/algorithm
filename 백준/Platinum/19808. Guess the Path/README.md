# [Platinum II] Guess the Path - 19808

[문제 링크](https://www.acmicpc.net/problem/19808)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 71, 정답: 18, 맞힌 사람: 17, 정답 비율: 29.825%

### 분류

이분 탐색, 분할 정복

### 문제 설명

<p>You are going to take part in robot programming contest. You will have to launch robots to a special field that has detectors at some cells. The jury has chosen one of the shortest paths on the field and you have to find it.</p>

<p>The field is a grid rectangle with $m$ rows and $n$ columns. Let us denote the cell at the $i$-th row and the $j$-th column as $(i, j)$ ($1 \le i \le m$, $1 \le j \le n$). Every path that the robot can be launched along must start at the top-left cell of the grid which has coordinates $(1, 1)$, pass some cells of the field, and end at the bottom-right cell which has coordinates $(m, n)$.</p>

<p>In one step the robot can move one cell down, or one cell to the right. Therefore if the robot is at the cell $(i, j)$, it can move to the cell $(i + 1, j)$ or to the cell $(i, j + 1)$. The robot cannot move outside of the field. The path of the robot consists of $m + n - 2$ steps, so it moves from the cell $(1, 1)$ to the cell $(m, n)$ visiting some other cells.</p>

<p>The jury has chosen one of the possible robot paths. This path is not known to participants. Each cell that belongs to the path chosen by the jury has special detector installed in it. When the robot enters the cell with the detector, the detector reports that the cell was visited.</p>

<p>The participant can launch the robot along any allowed path from $(1, 1)$ to $(m, n)$. After every launch the jury tells the participant which cells that have detectors installed have reported that the cell was visited. Your task is to launch the robot at most $10$ times, and find out the path that the judges have chosen.</p>

### 입력



### 출력



### 힌트

<p>The picture 1 shows the path chosen by the jury in the first sample test. The string that specifies this test is &quot;<code>RDRDR</code>&quot;.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/19808.%E2%80%85Guess%E2%80%85the%E2%80%85Path/a955225f.png" data-original-src="https://upload.acmicpc.net/0b2a3346-72f8-4f52-bd2c-554de768b01a/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 206px; height: 100px;" /></p>

<p style="text-align: center;">Picture 1. The chosen path is &ldquo;RDRDR&rdquo;.</p>

<p>The picture 2 shows the first query. The cells of the path &quot;<code>DDRRR</code>&quot; are denoted with bold frame. The cells that belong to the path chosen by the jury, the ones that have the detector that reports the presence of the robot, are shaded.</p>

<p>The picture 3 shows the second query. The cells of the path &quot;<code>DRRRD</code>&quot; are denoted with bold frame. The cells that belong to the path chosen by the jury, the ones that have the detector that reports the presence of the robot, are shaded.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/19808.%E2%80%85Guess%E2%80%85the%E2%80%85Path/d258da64.png" data-original-src="https://upload.acmicpc.net/e4c1bd8f-33ec-4a90-af5f-2dc337f8da44/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 205px; height: 100px;" /></p>

<p style="text-align: center;">Picture 2. Query &quot;<code>DDRRR</code>&quot;.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/19808.%E2%80%85Guess%E2%80%85the%E2%80%85Path/42179194.png" data-original-src="https://upload.acmicpc.net/9fd3d036-1ce9-4644-a48d-e1c7b7b8bc0e/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 206px; height: 100px;" /></p>

<p style="text-align: center;">Picture 3. Query &quot;<code>DRRRD</code>&quot;.</p>