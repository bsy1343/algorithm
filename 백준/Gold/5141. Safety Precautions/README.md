# [Gold V] Safety Precautions - 5141

[문제 링크](https://www.acmicpc.net/problem/5141)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 38, 정답: 15, 맞힌 사람: 13, 정답 비율: 37.143%

### 분류

다이나믹 프로그래밍, 브루트포스 알고리즘, 비트마스킹

### 문제 설명

<p>Explosions of oil rigs (and &mdash; for that matter &mdash; other factories and production systems) are supposed to be prevented by multi-level security systems. For instance, a pipe leak may not be a problem if you have another pipe around it to catch the oil. High pressure will not cause a major damage if you have relief valves, etc. A large share of good engineering is building safety into systems naturally. To &ldquo;encourage&rdquo; such good engineering, the government tends to prescribe safety regulations to be followed for building deep-water oil rigs. Unfortunately, to work, such regulations also need to be enforced which hasn&rsquo;t really been the case so much the last few years<sup>1</sup>.</p>

<p>A simplified way to model safety issues in a system such as an oil well is the following: Components may depend on other components for their operation, and they can malfunction. Some may malfunction on their own; others malfunction only if some of the others they depend on already malfunctioned. For simplicity, in this problem, we will ensure that there will never be cycles in the component dependencies. Each component i has a threshold t<sub>i</sub> &ge; 0, meaning that it can only malfunction if at least t<sub>i</sub> of the components it depends on malfunctioned before. Thus, components with t<sub>i</sub> = 0 can malfunction on their own.</p>

<p>Now, we can equip components with safety technology. For a component i, the price for this technology will be a real number p<sub>i</sub> &ge; 0. If we pay the price and add the technology to component i, it will never malfunction, even if all the other components it depends on do. Our goal is to protect a particular designated component from malfunctioning: imagine that this component corresponds to the oil rig exploding. Of course, we want to do so at the lowest total cost.</p>

<p><sup>1</sup>I wish that it were just my sarcastic streak making this up, but indeed, it seems that sexual relations were more common than actual enforcing between the oil industry and the Minerals Management Service.</p>

### 입력

<p>The first line contains the number K of data sets. This is followed by K data sets, each of the following form:</p>

<p>The first line of each data set contains an integer 1 &le; n &le; 20, the number of components in the system. The component we want to protect will always be component n.</p>

<p>This is followed by n lines, each describing one component. The first number in line i is the threshold of component i. The second number (a floating point number) is the price for protecting the component. The remaining numbers in line i are the indices of the (0 or more) other components that component i depends on. All of them will be strictly less than i (which also ensures that there will be no cycles in the dependencies).</p>

### 출력

<p>For each data set, output &ldquo;Data Set x:&rdquo; on a line by itself, where x is its number. On the next line, output the minimum cost at which component n can be completely protected from malfunction, rounded to two decimals. Each data set should be followed by a blank line.</p>