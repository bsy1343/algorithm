# [Platinum II] Crazy Circuits - 4490

[문제 링크](https://www.acmicpc.net/problem/4490)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 7, 정답: 5, 맞힌 사람: 3, 정답 비율: 60.000%

### 분류

최대 유량, 그래프 이론

### 문제 설명

<p>You&rsquo;ve just built a circuit board for your new robot, and now you need to power it. Your robot circuit consists of a number of electrical components that each require a certain amount of current to operate. Every component has a + and a &minus; lead, which are connected on the circuit board at junctions. Current flows through the component from + to &minus; (but note that a component does not &ldquo;use up&rdquo; the current: everything that comes in through the + end goes out the &minus; end).</p>

<p>The junctions on the board are labeled 1, ..., N, except for two special junctions labeled + and &minus; where the power supply terminals are connected. The + terminal only connects + leads, and the &minus; terminal only connects &minus; leads. All current that enters a junction from the &minus; leads of connected components exits through connected + leads, but you are able to control how much current flows to each connected + lead at every junction (though methods for doing so are beyond the scope of this problem). Moreover, you know you have assembled the circuit in such a way that there are no feedback loops (components chained in a manner that allows current to flow in a loop).</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/4490.%E2%80%85Crazy%E2%80%85Circuits/392bd7d2.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4490/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:237px; width:594px" /></p>

<p>Figure 1: Examples of two valid circuit diagrams. In (a), all components can be powered along directed paths from the positive terminal to the negative terminal. In (b), components 4 and 6 cannot be powered, since there is no directed path from junction 4 to the negative terminal.</p>

<p>In the interest of saving power, and also to ensure that your circuit does not overheat, you would like to use as little current as possible to get your robot to work. What is the smallest amount of current that you need to put through the + terminal (which you can imagine all necessarily leaving through the &minus; terminal) so that every component on your robot receives its required supply of current to function?</p>

### 입력

<p>The input file will contain multiple test cases. Each test case begins with a single line containing two integers: N (0 &le; N &le; 50), the number of junctions not including the positive and negative terminals, and M (1 &le; M &le; 200), the number of components in the circuit diagram. The next M lines each contain a description of some component in the diagram. The i th component description contains three fields: p<sub>i</sub>, the positive junction to which the component is connected, n<sub>i</sub>, the negative junction to which the component is connected, and an integer I<sub>i</sub> (1 &le; I<sub>i</sub> &le; 100), the minimum amount of current required for component i to function. The junctions pi and ni are specified as either the character &lsquo;+&rsquo; indicating the positive terminal, the character &lsquo;-&rsquo; indicating the negative terminal, or an integer (between 1 and N) indicating one of the numbered junctions. No two components have the same positive junction and the same negative junction. The end-of-file is denoted by an invalid test case with N = M = 0 and should not be processed.</p>

### 출력

<p>For each input test case, your program should print out either a single integer indicating the minimum amount of current that must be supplied at the positive terminal in order to ensure that every component is powered, or the message &ldquo;impossible&rdquo; if there is no way to direct a sufficient amount of current to each component simultaneously.</p>