# [Gold III] Vista 9 - 20146

[문제 링크](https://www.acmicpc.net/problem/20146)

### 성능 요약

시간 제한: 0.1 초, 메모리 제한: 128 MB

### 통계

제출: 22, 정답: 6, 맞힌 사람: 6, 정답 비율: 37.500%

### 분류

애드 혹, 해 구성하기, 런타임 전의 전처리, 휴리스틱, 외판원 순회 문제

### 문제 설명

<p>One day a large unnamed company in Prague decided to install a new operating system (made by another unnamed large company in USA) on all of their computers. Everybody was excited, because the company which made the OS was very famous and there were many advertisements of the OS, so it must be the best OS ever. Only the main network administrator didn&rsquo;t share their enthusiasm. And his doubts had soon been fulfilled. While installing the new OS on the last computer, all of the other computers got frozen and they weren&rsquo;t able to get controlled remotely. The poor administrator has now no other chance to wake them up than go physically to each of the computers and restart them manually.</p>

<p>Please help the poor administrator and recommend him an order in which he should visit the computers and return to the computer he started with (hopefully not to start another round of reboots there). You know the position of each computer given by two coordinates \(x\) and \(y\). All computers are in the plane and the distance between any pair of them is given by the Euclidean metric; i.e. the distance between computers with coordinates (\(x_1\), \(y_1\)) and (\(x_2\), \(y_2\)) is equal to \(\sqrt{(x_1-x_2)^2+(y_1-y_2)^2}\).</p>

### 입력

<p>The first line of the input contains one integer \(N\) (1 &le; \(N\) &le; 1 000 000), the number of computers. Then \(N\) lines follow and the \(i\)-th line contains two whole numbers&nbsp;\(x_i\), \(y_i\) (0 &le; \(x_i\), \(y_i\)&nbsp;&le; 1 000 000) &ndash; the coordinates of the \(i\)-th computer. The computers are placed at distinct locations.</p>

### 출력

<p>The output should contain \(N\) + 1 lines containing the numbers of computers in the order of the recommended journey. The last computer must be the same as the first one. The circuit can start at any computer.</p>