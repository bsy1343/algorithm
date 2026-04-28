# [Gold III] Car Trouble - 5017

[문제 링크](https://www.acmicpc.net/problem/5017)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 21, 정답: 7, 맞힌 사람: 7, 정답 비율: 33.333%

### 분류

그래프 이론, 그래프 탐색

### 문제 설명

<p>The city center of an unnamed Nordic university town consists of what was once a medieval city with narrow winding streets completely surrounded by a high wall protecting the city against Swedish invaders and other unwanted elements. The wall has since been removed and replaced by a system of interconnecting roads completely circumscribing the old part of the town. The roads inside still remains more or less the same as it was in the middle ages, which of course comes in conflict with modern requirements for accessibility by car, resulting in a maze of twisty little one-way streets, all alike, mixed with slightly wider two-way streets.</p>

<p>Making changes to the traffic routes in such a city can easily cause unexpected sideeffects if you do not plan carefully ahead. The story goes that a prominent member of the city council once submitted a proposal to the council regarding extensive changes to how the traffic should be organized in the city center. The proposal did have the merit that it would be very easy to drive in to the central square, but it would unfortunately also be impossible to drive out again. The council member in question later went on to become minister of justice in the country under the parole that society should be harder on criminals &ndash; &ldquo;it should be easy to go to jail, but difficult to get out again&rdquo;.</p>

<p>To avoid mistakes as the one above, the city planners need you to develop a tool that can help them discover any traffic problems in the planning stage. The planners need to be alerted of two different situations. The first situation is that a street exists in the city center from which you cannot reach the surrounding, circular, system of roads, i.e., you are trapped inside the city. The second situation is that a street exists in the city that cannot be reached from the surrounding system of roads, i.e., it is unreachable.</p>

### 입력

<p>The input consists of a description of how streets connect to each other and the surrounding circular road system. Each street (or a segment of a street) within the city center is represented by an arbitrary integer id number &gt; 0 (0 &lt; id &lt; 1000). The surrounding circular road system is represented by the special id number 0.</p>

<p>First line: An integer giving the number of streets (including the surrounding road system, 0 &lt; streets &le; 1000).</p>

<p>The following lines: One line for each street (no particular order required and the surrounding road system is included) consisting of a number of integers. First an integer giving the id number of the street. Second, the number of (other) streets that can be reached from this street. Third, a sequence of street id numbers indicating which streets can be reached from this street.</p>

### 출력

<p>One line for each street on which you would be trapped within the city consisting of the text &ldquo;TRAPPED X&rdquo; where &ldquo;X&rdquo; is replaced by street id number in question.</p>

<p>Then, one line for each street within the city that is unreachable from the surrounding system of roads consisting of the text &ldquo;UNREACHABLE X&rdquo; where X should be replaced by the street id in question.</p>

<p>If no problems are found, i.e., you are not trapped in any street and every street is reachable, you should print a single line containing the text &ldquo;NO PROBLEMS&rdquo;.</p>

<p>If multiple streets cause you to get trapped &ndash; or are unreachable &ndash; you should list them in the same order they were entered in the input (within respective category).</p>