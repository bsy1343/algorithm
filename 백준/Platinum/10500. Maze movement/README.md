# [Platinum IV] Maze movement - 10500

[문제 링크](https://www.acmicpc.net/problem/10500)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 62, 정답: 50, 맞힌 사람: 40, 정답 비율: 80.000%

### 분류

수학, 그래프 이론, 정수론, 최대 유량, 유클리드 호제법

### 문제 설명

<p>Your boss gave you the task of creating a walking maze, and you are evaluating different designs. Before you commit to one, you want to know how quickly people can move in and out of each different maze. After all, your boss is interested in making money on this venture and, the faster people can move through, the more paying customers you can handle.</p>

<p>A maze is a set of numbered rooms and passages connecting the rooms. The maze&rsquo;s only entrance is at the lowest-numbered room and the only exit is at the highest-numbered room.</p>

<p>Each passage has a limit in the number of people that can pass through at a time. For two rooms numbered x and y, if x and y have a common factor greater than one, then there is a passage between x and y. The largest common factor p is the number of people per minute that can walk from x to y. Simultaneously, p people per minute can also be walking from y to x. The entrance, exit, and rooms can handle any number of people walking through at a time. People want to get through the maze as quickly as possible, so they do not wait around in the rooms.</p>

<p>Here are illustrations of the two sample inputs. Boxes represent the numbered rooms, and each arrow is a passage labeled by the number of people per minute that can walk through it.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/10500.%E2%80%85Maze%E2%80%85movement/6a3f7d3f.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/10500.%E2%80%85Maze%E2%80%85movement/6a3f7d3f.png" data-original-src="https://www.acmicpc.net/upload/images2/maze(2).png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:171px; width:485px" /></p>

### 입력

<p>Input is a single maze description. The first line is an integer 2 &le; n &le; 1000 indicating the number of rooms in the maze. This is followed by n unique integers, one per line, which are the room numbers for the maze. Each room number is in the range [2, 2 &times; 10<sup>9</sup>].</p>

### 출력

<p>Print the maximum number of people per minute that can enter the maze, assuming that people are exiting the maze at the same speed as people entering. No maze supports more than 10<sup>9</sup> people entering per minute.</p>