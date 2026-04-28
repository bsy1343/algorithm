# [Gold V] Terrace Hill - 23783

[문제 링크](https://www.acmicpc.net/problem/23783)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB

### 통계

제출: 46, 정답: 33, 맞힌 사람: 32, 정답 비율: 78.049%

### 분류

자료 구조, 스택

### 문제 설명

<p>All explored mountain terraces in Girotti hills in Charitum Montes on the southern Martian hemisphere have a peculiar feature &mdash; their sizes are approximately equal, and they all lie on a hypothetical straight line.</p>

<p>The flat surface of the terraces is ideal for future housing development. Unusual configuration of the terraces allows for a daring engineering project which will connect some terraces by bridges.</p>

<p>Due to relative geological instability in the surrounding region, the surface of any two terraces connected by a bridge has to be in the same height. Obviously, a bridge between two terraces can be built only when the height of all terraces between the given two is less than the height of the two terraces to be connected.</p>

<p>The engineers of the project want to know the maximum total length of all bridges that can be built. To simplify the introductory calculations, the following assumptions are made. The distance between two neighbour terraces is negligibly small, it is considered to be zero in all cases. The width of a terrace is considered to be one length unit.</p>

### 입력

<p>The first line contains an integer N (1 &le; N &le; 3 &middot; 10<sup>5</sup>) the number of the terraces. The second line contains N integers a<sub>1</sub>, a<sub>2</sub>, . . . , a<sub>N</sub> (1 &le; a<sub>i</sub> &le; 10<sup>6</sup>) where a<sub>i</sub> is the height of i-th terrace. The heights are given in the order of terraces on the (hypothetical) line.</p>

### 출력

<p>Print one integer &ndash; the maximum possible total length of all bridges.</p>