# [Gold II] Mysterious Villa - 6695

[문제 링크](https://www.acmicpc.net/problem/6695)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 5, 정답: 4, 맞힌 사람: 4, 정답 비율: 80.000%

### 분류

너비 우선 탐색, 비트마스킹, 그래프 이론, 그래프 탐색

### 문제 설명

<p>Mr. Black is an advisor of the Turkish president and as such, he is going to come to the NATO Summit. He likes to live alone, far from the official Summit hotels. Therefore, he rented a big villa in Orechovka. Only one thing bothers him: although there are light switches in most rooms, the lights they control are often in other rooms than the switches themselves. While his estate agent saw this as a feature, Mr. Black has come to believe that the electricians were a bit absent-minded (to put it mildly) when they connected the switches to the outlets.</p>

<p>Some nights, Mr. Black will come home late. While standing in the hallway, the lights in all other rooms are switched off. Unfortunately, Mr. Black is afraid of the dark, so he never dares to enter a room that had its lights out and would never switch off the lights of the room he was in. Mr. Black wants to use the incorrectly wired light switches to his advantage. He should manage to get to his bedroom and to switch off all lights except for the one in the bedroom.</p>

<p>You are to write a program that, given a description of a villa, determines how to get from the hallway to the bedroom if only the hallway light is initially switched on. You may never enter a dark room, switch off the light in the room you are just in, and after the last move, all lights except for the one in the bedroom must be switched off. If there are several paths to the bedroom, you have to find the one which uses the smallest number of steps, where &quot;move from one room to another&quot;, &quot;switch on a light&quot; and &quot;switch off a light&quot; each counts as one step.</p>

### 입력

<p>The input file contains several villa descriptions. Each villa starts with a line containing three integers R, D, and S. R is the number of rooms in the villa, 1 &lt;= R &lt;= 10, D is the number of doors/connections between the rooms, and S is the number of light switches in the villa. The rooms are numbered from 1 to R, room number 1 is the hallway, room number R is the bedroom.</p>

<p>This line is followed by D lines containing two integers I and J each, specifying that room I is connected to room J by a door. Then follow S lines containing two integers K and L each, indicating that there is a light switch in room K that controls the light in room L. A blank line separates the villa description from the next one. The input file ends with a villa having R = D = S = 0, which should not be processed.</p>

### 출력

<p>For each villa, output a single line. If there is a solution to Mr. Black&#39;s problem, output the sentence &quot;Mr. Black needs X steps.&quot; where X is the minimal number of steps that lead him to his bedroom and only leave the bedroom light switched on.</p>

<p>If there is no solution, output the statement &quot;Poor Mr. Black! No sleep tonight!&quot;.</p>