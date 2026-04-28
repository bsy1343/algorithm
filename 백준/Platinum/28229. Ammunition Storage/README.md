# [Platinum II] Ammunition Storage - 28229

[문제 링크](https://www.acmicpc.net/problem/28229)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 53, 정답: 13, 맞힌 사람: 11, 정답 비율: 22.917%

### 분류

자료 구조, 세그먼트 트리, 스택, 다차원 세그먼트 트리

### 문제 설명

<p>The Do-Barareh military area is like an n&times;m grid, each cell of which has a specific height. The commander of this military area is looking for a rectangular sub-area of this area, with width and height least 2, whose its four corner cells are higher than the rest of its cells. He plans to install watchtowers in the corners of this sub-area to monitor the entire sub-area and use it for ammunition storage. Your job is to help the commander to find out how many valid sub-areas there are to choose as the ammunition storage. You can assume cell heights are distinct.</p>

### 입력

<p>The first line of input contains two space-separated integers n and m (2 ⩽ n, m ⩽ 750). Each of the next n lines contains m space-separated integers showing the cell heights. It is guaranteed cell heights are distinct numbers between 1 and nm (inclusive).</p>

### 출력

<p>Print the number of valid sub-areas to be used as an ammunition storage.</p>