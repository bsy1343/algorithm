# [Platinum IV] Borg Boogie - 5023

[문제 링크](https://www.acmicpc.net/problem/5023)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 95, 정답: 11, 맞힌 사람: 9, 정답 비율: 64.286%

### 분류

수학, 확률론, 선형대수학, 베이즈 정리

### 문제 설명

<p>Being a space captain can be a dangerous endeavour, especially when conducting missions in Borg space. Today your captain has been tasked with beaming aboard a Borg spaceship to see if he can discover anything useful. The Borg ship consist of rooms connected with passages of equal length, and with no more than one direct passage between any two rooms. It is possible to find a path from any room to any other.</p>

<p>On the Borg ship there is also a sentry, placed there by the Borg eons ago. This sentry operates according to a rather unsophisticated algorithm, namely walking at random. This gives the sentry one advantage, however: You will never know where it is! More precisely, once every minute, the sentry chooses one of the neighbouring rooms with uniform probability, and walks quickly to this room. Your captain will also be spending exactly one minute in each room, and to minimise the chances that he will meet the sentry, you time his movement such that he and the sentry move at exactly the same time. Thus he will be caught by the sentry if and only if the two of them move into the same room at the same time, or if they try to swap rooms.</p>

<p>Star Fleet has issued as a direct order the rooms your captain is to visit, and in the exact order. These rooms form a walk on the Borg ship, where each room may be visited several times. Star Fleet has also provided you with a map of the ship. The captain will be beamed down to the first room of the walk, and will be beamed back up from the last room. He risks capture in both these rooms.</p>

<p>Now the captain starts wondering about the chances of success on this mission, hoping them to be very low indeed. After all, that makes it all the more interesting! Getting curious yourself, you decide you want to figure this out. Unfortunately the ship&rsquo;s android is experiencing problems with his new emotion chip, and thus the task falls on you to compute the captain&rsquo;s chances of success on this dangerous mission!</p>

### 입력

<p>One line with 2 &le; N &le; 500 &ndash; the number of nodes.</p>

<p>One line with 1 &le; L &le; 500 &ndash; the number of rooms the captain must visit.</p>

<p>One line with L numbers describing the captain&rsquo;s walk, i.e. they give the exact walk the captain must perform.</p>

<p>N lines beginning with an integer n<sub>i</sub> &ndash; the number of neighbours of node i &ndash; followed by n<sub>i</sub> numbers &ndash; the neighbours of node i, 0-indexed.</p>

### 출력

<p>The chance the captain will be able to complete his mission without being discovered by the Borg sentry.</p>