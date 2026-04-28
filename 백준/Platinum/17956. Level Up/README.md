# [Platinum I] Level Up - 17956

[문제 링크](https://www.acmicpc.net/problem/17956)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 242, 정답: 56, 맞힌 사람: 48, 정답 비율: 29.448%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 배낭 문제

### 문제 설명

<p>Being a fan of MMORPGs, Steve was really excited when World of Warcraft Classic was announced. He started playing from the first day and now has only two levels to go till the maximum level. Of course, he doesn&rsquo;t have as much time as he used to have when the game first appeared, so he really wants to finish these two levels as fast as possible.</p>

<p>In order to pass the first level, Steve needs s<sub>1</sub> experience. Only after he gains it, he can move to the second level, in which he needs to get other s<sub>2</sub> experience to pass it.</p>

<p>Steve has the list of n available quests. He knows that he may finish two levels with these quests. In order to pass the i-th quest, Steve needs t<sub>i</sub> minutes. As a result, he will get x<sub>i</sub> experience for this quest.</p>

<p>When Steve finishes a quest that takes him to the next level, the extra experience overflow is subtracted from the next level&rsquo;s required experience. Once he levels up, all the quests that are left will offer less experience y<sub>i</sub>, but they will also require less time r<sub>i</sub>.</p>

<p>Note that if Steve finishes a quest, he <strong>can&rsquo;t</strong> repeat this quest anymore (even in another level).</p>

<p>Given the list of quests, help Steve choose the order in which he will be doing the quests in order to finish the last two levels as fast as possible.</p>

### 입력

<p>The first line contains three integers n, s<sub>1</sub>, s<sub>2</sub> (1 &le; n, s<sub>1</sub>, s<sub>2</sub> &le; 500) &mdash; the number of quests, experience required for the first level and experience required for the second level.</p>

<p>Each of the next n lines contains four integers x<sub>i</sub>, t<sub>i</sub>, y<sub>i</sub>, r<sub>i</sub> (1 &le; y<sub>i</sub> &lt; x<sub>i</sub> &le; 500, 1 &le; r<sub>i</sub> &lt; t<sub>i</sub> &le; 10<sup>9</sup>) where x<sub>i</sub> and y<sub>i</sub> are the experience you will gain from the i-th quest on the 1-st and 2-nd level respectively and t<sub>i</sub> and r<sub>i</sub> are the number of minutes you need to spend in order to pass this quest on the 1-st and 2-nd level respectively,</p>

### 출력

<p>Print one number, representing the minimum number of minutes that Steve needs to finish two levels, or &minus;1 if there is no way to complete quests to finish both levels.`</p>