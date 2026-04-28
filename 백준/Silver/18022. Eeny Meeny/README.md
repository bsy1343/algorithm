# [Silver III] Eeny Meeny - 18022

[문제 링크](https://www.acmicpc.net/problem/18022)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 101, 정답: 88, 맞힌 사람: 80, 정답 비율: 86.957%

### 분류

구현, 자료 구조, 덱

### 문제 설명

<p>&ldquo;Eeny meeny miny moe&rdquo; is a well-known nursery rhyme in English, used (among other things) by kids to &ldquo;randomly&rdquo; select members of a team. It exists in many variations, one of which goes like this:</p>

<blockquote>
<p>Eeny, meeny, miny, moe,<br />
Catch a tiger by the toe.<br />
If he hollers, let him go,<br />
Eeny, meeny, miny, moe.</p>
</blockquote>

<p>Similar verses exist in most languages, such as &ldquo;Ulle dulle dof&rdquo; in Finnish, &ldquo;Akka bakka bonka rakka&rdquo; in Norwegian, and &ldquo;Ole dole doff&rdquo; in Swedish.</p>

<p>Two teams are to be selected for a game and the rhyme is used to select one kid for a team at a time, alternating between the two teams, until all kids have been selected. The kids are standing in a circle. In each selection round we start counting the kids in clockwise order around the circle, skipping one kid for every word in the rhyme, until the last word. The kid matching the last word is chosen for the current team and then the next round starts. In all rounds but the first, the counting starts at the next remaining kid (in clockwise order) after the one that was selected in the previous round. See Figure E.1 for an example.</p>

<p>Given such a rhyme, and a group of kids, can you tell which kids will be in which team?</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/18022.%E2%80%85Eeny%E2%80%85Meeny/7be3737a.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/18022.%E2%80%85Eeny%E2%80%85Meeny/7be3737a.png" data-original-src="https://upload.acmicpc.net/00be2ded-b260-4311-99a1-a1d3da66c3cb/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 615px; height: 189px;" /></p>

<p>Figure E.1: Illustration of the first three rounds of Sample Input 1. In rounds 1 and 3, Alvar and Rakel get selected for the first team, and in round 2, Lisa is selected for the second team. In round 4 (not shown), only Kalle remains and is selected for the second team.</p>

### 입력

<p>The first line of input contains the rhyme, consisting of a list of words separated by spaces. The second line of input contains an integer n (1 &le; n &le; 100), the number of kids. Then follow the names of the kids, one per line. The kids are given in clockwise order and the first kid listed is the one at which counting starts in the first round.</p>

<p>All words and names consist only of upper and lower case letters &lsquo;A&rsquo;-&lsquo;Z&rsquo; and &lsquo;a&rsquo;-&lsquo;z&rsquo;. No input line is empty or longer than 100 characters (excluding the newline character at the end of the line).</p>

### 출력

<p>Output the two teams, starting with the one whose first member is chosen first. For each team, output the number of kids in the team, followed by the names of the kids in the team, in the same order as they were chosen for the team.</p>