# [Gold II] Good Samples - 24574

[문제 링크](https://www.acmicpc.net/problem/24574)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 65, 정답: 27, 맞힌 사람: 22, 정답 비율: 46.809%

### 분류

그리디 알고리즘, 해 구성하기

### 문제 설명

<p>You are composing music for the Cool Clarinet Competition (CCC). You have been instructed to make a piece of music with exactly N notes. A note is represented as a positive integer, indicating the pitch of the note.</p>

<p>We call a non-empty sequence of consecutive notes in the piece a sample. For instance, (3, 4, 2), (1, 2, 3, 4, 2) and (4) are samples of 1, 2, 3, 4, 2. Note that (1, 3) is not a sample of 1, 2, 3, 4, 2. We call two samples different if they start or end at a different position in the piece.</p>

<p>We call a sample <em>good</em> if no two notes in the sample have the same pitch.</p>

<p>The clarinet players are picky in two ways. First, they will not play any note with pitch higher than M. Second, they want a piece with exactly K good samples.</p>

<p>Can you construct a piece to satisfy the clarinet players?</p>

### 입력

<p>The first and only line of input will contain 3 space-separated integers, N, M and K.</p>

### 출력

<p>If there is a piece of music that satisfies the given constraints, output N integers between 1 and M, representing the pitches of the notes of the piece of music. If there is more than one such piece of music, any such piece of music may be outputted.</p>

<p>Otherwise, output &minus;1.</p>