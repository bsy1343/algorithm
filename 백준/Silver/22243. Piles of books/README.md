# [Silver V] Piles of books - 22243

[문제 링크](https://www.acmicpc.net/problem/22243)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 67, 정답: 47, 맞힌 사람: 44, 정답 비율: 70.968%

### 분류

구현

### 문제 설명

<p>A large number of books have arrived to the library of the Aglargond School of Magic and they need to be arranged on the shelves. On the library floor, tiled with equal square tiles, librarians marked a square‐shaped area (length of the side of this square is N square tiles) for temporary storage of the books. Books were either stacked on top of the other books or on the empty tiles in the marked area in such fashion that a stack of books is formed on some tiles. The youngest student got an assignment to enter information about every book into the catalogue and arrange the books to their shelves. After hearing this news he just stood beside the books and sighed burdened by the amount of work he had to do. Going alongside the edges of the marked area he looks in directions parallel to sides of the marked area and counts stacks of books visible. A stack is visible if there is no higher stack or stack with equal height between it and the student. Write a program&nbsp;that counts the number of stacks visible to the young magician while walking beside the books.</p>

### 입력

<p>The first line of input contains length of the side of the marked area, N (1&nbsp;&le;&nbsp;N&nbsp;&le;&nbsp;50). Each of the next N lines contains N non‐negative integers not greater than 1000 separated by single space character, representing heights of stacks (in cm) of books on each floor tile. If there are no books on a tile, height of the stack is 0.</p>

### 출력

<p>The output should contain the number of visible stacks.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/8dc2ad63-a507-48d1-90cb-9e246017ed58/-/preview/" style="width: 332px; height: 232px;" /></p>

<p>Stack on the position (2, 2) is not visible and tiles (2, 3), (3, 3) and (3, 4) have no books on it.</p>