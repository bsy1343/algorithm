# [Silver III] Tic-Tac State - 24413

[문제 링크](https://www.acmicpc.net/problem/24413)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 46, 정답: 39, 맞힌 사람: 32, 정답 비율: 84.211%

### 분류

비트마스킹, 구현

### 문제 설명

<p>Congratulations! You are starting your internship for the famous digital archaeologist, Endiana Jones. You have been assigned to evaluate the results of saved games of a 1980&rsquo;s version of Tic-Tac-Toe. In those days, programmers had very little storage, so they saved game state as compactly as possible. In this case, the state was in a 32-bit register. Bits $0$ &minus; $8$ stored the positions that had been played and bits $9$ &minus; $17$ indicated an X or O. A set bit (1 bit) indicated a played position for bits $0$ &minus; $8$ or that X played for bits $9$ &minus; $17$. Bit $18$ indicated the next player to play. (Bits are numbered from right to left, starting at the least-significant bit.) If bit $18$ is set (is $1$), it is X&rsquo;s turn to play next. Visually the bits were laid out as shown in Figure M.1:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/24413.%E2%80%85Tic-Tac%E2%80%85State/144d7fba.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/24413.%E2%80%85Tic-Tac%E2%80%85State/144d7fba.png" data-original-src="https://upload.acmicpc.net/c5d96ac7-6aa2-4b4d-a8ef-208064ce79de/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 458px; height: 146px;" /></p>

<p style="text-align: center;">Figure M.1: Bits in a game state</p>

<p>The game represented by the picture would have bits $0$ &minus; $8$ set because all positions have been played. Bits $10$, $11$, $12$, and $15$ would be set because those positions contain an X. Bit $18$ would be set because it would be X&rsquo;s turn next. The state would be represented in binary as: <code>1 001 001 110 111 111 111</code> or in octal as $01116777$.</p>

<p>The Tic-Tac-Toe implementation was very simple, and a cat&rsquo;s game (draw or tie) was not called until all positions had been played. Your task is to interpret the state of the game given an <strong>octal</strong> integer.</p>

<p><strong>Quick review of Tic-Tac-Toe:</strong> Two players play the game. Either player may go first. One player&rsquo;s mark is X and the other&rsquo;s is O. Each player takes turns placing their mark in one of the empty squares. If a player gets three marks in a horizontal, vertical, or diagonal row, that player wins. If there is no winner and there are no empty spaces left, the game stops, and the game is declared &ldquo;Cat&rsquo;s&rdquo; game.</p>

### 입력

<p>The first line of input consists of a single decimal integer $c$ ($1 &le; c &le; 10\,000$), the number of states to evaluate. Each of the following $c$ lines will have a single <strong>octal</strong> number representing the state of a game. All numbers will follow the convention of writing octal numbers with a leading $0$. All game states will be legal, that is, achievable in a real game of Tic-Tac-Toe.</p>

### 출력

<p>For each game state number print a single line indicating the state of the game. The four possible output lines are:</p>

<pre>
O wins
X wins
Cat&#39;s
In progress</pre>