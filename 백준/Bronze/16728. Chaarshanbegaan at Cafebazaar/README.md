# [Bronze II] Chaarshanbegaan at Cafebazaar - 16728

[문제 링크](https://www.acmicpc.net/problem/16728)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 286, 정답: 214, 맞힌 사람: 189, 정답 비율: 75.000%

### 분류

수학, 구현, 기하학, 사칙연산, 피타고라스 정리

### 문제 설명

<p>Chaarshanbegaan is a gathering event at Cafebazaar similar to TGIF events at Google. Some entertainment programs like pantomime, foosball, Xbox/PS4, and several board games are part of the event. You are going to set up a dart game in Chaarshanbegaan. As a techie organizing a game for techies, you would rather use a smart screen and write a program to calculate the scores instead of hanging a traditional dartboard and scoring the shots manually. Your program must get the coordinates of dart shots for a player and calculate his/her total score. The score for each dart shot (at point (x, y)) is calculated based on its distance from the center of the dartboard (point (0, 0)). If the distance is d millimeters, the score is calculated based on the following table:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/16728.%E2%80%85Chaarshanbegaan%E2%80%85at%E2%80%85Cafebazaar/66a21ea3.png" data-original-src="https://upload.acmicpc.net/a9fff8cc-e548-4b3a-a04c-ed33b9049e63/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 488px; height: 271px;" /></p>

### 입력

<p>The first line of the input contains a single integer N as the number of dart shots for a player (1 &le; N &le; 100). Each of the next N lines contains two space-separated integers as the coordinates (x, y) of a dart shot. The coordinates are in millimeters and their absolute values will not be greater than 300.</p>

### 출력

<p>Print a single line containing the total score of the player.</p>