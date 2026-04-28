# [Platinum II] TAMNICA - 2973

[문제 링크](https://www.acmicpc.net/problem/2973)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 109, 정답: 31, 맞힌 사람: 22, 정답 비율: 31.429%

### 분류

자료 구조, 덱, 덱을 이용한 구간 최댓값 트릭, 데이크스트라, 다이나믹 프로그래밍, 덱을 이용한 다이나믹 프로그래밍, 그래프 이론, 최단 경로

### 문제 설명

<p>Brave Sir Robin has been thrown in the dungeon by the evil king. The dungeon consists of an infinite number of cube-shaped rooms with big stone walls. Rooms are connected by passages so that the entire dungeon, when viewed from above, looks like a spiral. The rooms are numbered as follows:&nbsp;</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/2973.%E2%80%85TAMNICA/b25c1ef5.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/2973.%E2%80%85TAMNICA/b25c1ef5.png" data-original-src="https://upload.acmicpc.net/4661c14c-7563-424f-a1ec-1306e5321e42/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 218px; height: 192px;" /></p>

<p>After a big earthquake some of the walls collapsed, and new passages were formed between adjacent rooms.&nbsp;</p>

<p>Sir Robin is initially in room 1. Sir Robin knows that the exit from the dungeon is located in room N, and wants to escape while everyone is distracted by the earthquake. Because the evil dragon is guarding the dungeon, Sir Robin wants to use the fastest way out of the dungeon.&nbsp;</p>

<p>Write a program that, given the location of the exit N and the list of new passages, determines the smallest number of passages that Sir Robin must go through before he can exit the dungeon.&nbsp;</p>

### 입력

<p>The first line of input contains an integer N (1 &le; N &le; 10<sup>15</sup>), the room in which the exit is located.&nbsp;</p>

<p>The second line of input contains an integer K (1 &le; K &le; 100 000), the number of new passages.&nbsp;</p>

<p>Each of the following K lines contains one integer B (4 &le; B &le; 10<sup>15</sup>), meaning that a new passage now connects adjacent rooms A and B, where A&lt;B. The number A is not given explicitly, but it can be uniquely determined from B (for example, if B is 20, then A must be 7). Also, some rooms can never be room B (rooms 2, 3, 5, 7, 10, 13 etc.).&nbsp;</p>

### 출력

<p>Output should consist of a single integer, the smallest number of passages that Sir Robin must go through before he can exit the dungeon.&nbsp;</p>

### 힌트

<p>Clarification of first example. This is the layout of the dungeon after the earthquake:&nbsp;</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/2973.%E2%80%85TAMNICA/dd88d6d2.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/2973.%E2%80%85TAMNICA/dd88d6d2.png" data-original-src="https://upload.acmicpc.net/d631ae5f-3273-46c5-a152-3005de4fff0a/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 218px; height: 192px;" /></p>

<p>Mirko can use the route 1-4-15-14-13-30-31, using only 6 hallways to exit the dungeon.</p>