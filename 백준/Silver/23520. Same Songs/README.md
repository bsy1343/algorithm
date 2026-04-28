# [Silver I] Same Songs - 23520

[문제 링크](https://www.acmicpc.net/problem/23520)

### 성능 요약

시간 제한: 2 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 72, 정답: 23, 맞힌 사람: 19, 정답 비율: 45.238%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘

### 문제 설명

<p>Masha has a playlist of several songs in her music player. She listens to the songs in order (playlist is not cyclic: when the last song ends the player turns off). Masha likes repetitions, so she feels happy every time a song ends and the same one starts playing. When the same songs are separated by another one, Masha doesn&#39;t consider it a repetition.</p>

<p>The player doesn&#39;t have options of adding songs to playlist or shuffling it. But it can remove songs from the list. Your task is to remove some songs to maximize the number of repetitions (you may also remove everything or nothing from the list).</p>

### 입력

<p>The first line contains an integer $n$: the number of songs in the playlist ($1 \le n \le 50$). The second line contains $n$ space-separated numbers: the songs in the list. For clarity, the songs are denoted by integer numbers from $1$ to $50$.</p>

### 출력

<p>On the first line, print two space-separated numbers $m$ and $k$: the number of songs in the edited playlist and the number of repetitions in it. On the second line, print the playlist: $m$ space-separated numbers.</p>

<p>If there are several possible answers, print any one of them. If the list is empty, you can either print or not print the second line (which would be empty).</p>