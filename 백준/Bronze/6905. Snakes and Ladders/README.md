# [Bronze I] Snakes and Ladders - 6905

[문제 링크](https://www.acmicpc.net/problem/6905)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 137, 정답: 80, 맞힌 사람: 71, 정답 비율: 59.167%

### 분류

구현, 시뮬레이션

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/6905.%E2%80%85Snakes%E2%80%85and%E2%80%85Ladders/6ea67f2e.png" data-original-src="%EB%B0%B1%EC%A4%80/Bronze/6905.%E2%80%85Snakes%E2%80%85and%E2%80%85Ladders/6ea67f2e.png" data-original-src="https://upload.acmicpc.net/e3645adb-528f-47c4-919c-ecb8a2fab3d6/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 469px; height: 433px; float: right;" />Here (see illustration) is a game board for the game Snakes and Ladders. Each player throws a pair of dice to determine how many squares his/her game piece will advance. If the piece lands on the bottom of a ladder, the piece moves up to the square at the top of the ladder. If the piece lands on the top of a snake, the piece &quot;slides&quot; down to the square at the bottom of the snake. If the piece lands on the last square, the player wins. If the piece cannot advance the number of squares indicated by the dice, the piece is not moved at all.</p>

<p>In order to help you play this game via a cell phone while travelling, you will write a program that simulates your moves on the board shown and, of course, runs on your handheld computer. You will repeatedly throw the dice and enter the result into the program. After each throw, the program will report the number of the square where your piece lands.</p>

<p>When the program starts it should assume the piece is on square $1$. It should repeatedly read input from the user (a number between $2$ and $12$) and report the number of the square where the piece lands. In addition, if the piece moves to the last square, the program should print <code>You Win!</code> and terminate. If the user enters 0 instead of a number between 2 and 12, the program should print <code>You Quit!</code> and terminate.</p>

<p>For clarity, you are to use the board pictured above and you should note that the board has $3$ snakes (from $54$ to $19$, from $90$ to $48$ and from $99$ to $77$) and 3 ladders (from $9$ to $34$, from $40$ to $64$ and from $67$ to $86$).</p>

### 입력



### 출력

