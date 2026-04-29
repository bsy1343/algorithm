# [Silver II] Dinner Time - 33640

[문제 링크](https://www.acmicpc.net/problem/33640)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 2048 MB

### 통계

제출: 22, 정답: 14, 맞힌 사람: 14, 정답 비율: 73.684%

### 분류

구현, 두 포인터, 많은 조건 분기, 사칙연산, 수학, 시뮬레이션

### 문제 설명

<p>What a feast! Yams, cranberries, turkey, stuffing, pie. Yum! But the best is the potatoes and gravy.</p>

<p>Holiday feasts can also be stressful: people argue about politics and ask too many nosy questions. To complicate things, your family is <b>huge</b> with $10^{18}$ members so it seems inevitable that some people will fight. As the main organizer, you decide the best way to reduce the number of arguments is to have everyone sit in a line so they don’t have to face anyone else.</p>

<p>With such a large family, some help is needed to coordinate serving the food. The leftmost person in this seating arrangement starts with possession of both the potatoes and the gravy. Then a series of instructions are called, each saying to pass either the potatoes or the gravy a certain number of positions $K$. In doing so, the dish is passed exactly $K$ people to the right. While this instruction is being carried out, the first $K-1$ of these people will momentarily have possession of the dish before they pass it along. The last of these $K$ people will then retain the dish until another instruction is called out to pass it along. The next instruction, if any, will only be issued once this instruction has been fully carried out.</p>

<p>When a person first gains possession of the potatoes, they immediately put some on their plate even if they are just one of the $K-1$ intermediate people passing the potatoes along during an instruction. At any point of time, if the person possessing the gravy also has potatoes on their plate then they pour the gravy over the potatoes.</p>

<p>Unfortunately this means some people will not get gravy to put on their potatoes. Another reason to argue…</p>

<p>Your job is to figure out the number of lucky people who poured gravy on their potatoes.</p>

### 입력

<p>The first line of input contains a single integer $N$ ($1≤N≤10^5$) indicating the number of instructions that are called out. Each of the next $N$ lines describes an instruction. Such a line begins with a character <code>P</code> or <code>G</code> indicating if the potatoes or gravy will be passed, followed by an integer $K$ ($1≤K≤10^{18}$) indicating how far the dish should be passed in this instruction.</p>

<p>The total number of steps each dish will be passed will be less than $10^{18}$. If a dish does not reach a family member after all instructions are called, they will also will not be able to get both potatoes and gravy.</p>

### 출력

<p>Output the number of people that received potatoes and were able to pour gravy on their potatoes by the time all instructions have been completed.</p>