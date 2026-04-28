# [Silver II] Shuffle’m Up - 2722

[문제 링크](https://www.acmicpc.net/problem/2722)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 107, 정답: 61, 맞힌 사람: 52, 정답 비율: 56.522%

### 분류

구현, 자료 구조, 문자열, 브루트포스 알고리즘, 집합과 맵, 시뮬레이션, 해시를 사용한 집합과 맵

### 문제 설명

<p>A common pastime for poker players at a poker table is to shuffle stacks of chips. Shuffling chips is performed by starting with two stacks of poker chips, S<sub>1</sub> and S<sub>2</sub>, each stack containing C chips. Each stack may contain chips of several different colors.&nbsp;</p>

<p>The actual shuffle operation is performed by interleaving a chip from S<sub>1</sub> with a chip from S<sub>2</sub> as shown below for C=5:&nbsp;</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/2722.%E2%80%85Shuffle%E2%80%99m%E2%80%85Up/8a76a8fb.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/2722.%E2%80%85Shuffle%E2%80%99m%E2%80%85Up/8a76a8fb.png" data-original-src="https://www.acmicpc.net/upload/images/shff.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:314px; width:744px" /></p>

<p>The single resultant stack, S<sub>12</sub>, contains 2*C chips. The bottommost chip of S<sub>12</sub> is the bottommost chip from S<sub>2</sub>. On top of that chip, is the bottommost chip from S<sub>1</sub>. The interleaving process continues taking the 2<sup>nd</sup> chip from the bottom of S<sub>2</sub> and placing that on S<sub>12</sub>, followed by the 2<sup>nd</sup> chip from the bottom of S<sub>1</sub> and so on until the topmost chip from S<sub>1</sub> is placed on top of S<sub>12</sub>.&nbsp;</p>

<p>After the shuffle operation, S<sub>12</sub> is split into 2 new stacks by taking the bottommost C chips from S<sub>12</sub> to form a new S<sub>1</sub> and the topmost C chips from S<sub>12</sub> to form a new S<sub>2</sub>. The shuffle operation may then be repeated to form a new S<sub>12</sub>.&nbsp;</p>

<p>For this problem, you will write a program to determine if a particular resultant stack S<sub>12</sub> can be formed by shuffling two stacks some number of times.&nbsp;</p>

### 입력

<p>The first line of input contains a single integer N, (1 &le; N &le; 1000) which is the number of datasets that follow.&nbsp;</p>

<p>Each dataset consists of four lines of input. The first line of a dataset specifies an integer C, (1 &le; C &le; 100) which is the number of chips in each initial stack (S<sub>1</sub> and S<sub>2</sub>). The second line of each dataset specifies the colors of each of the C chips in stack S<sub>1</sub>, starting with the bottommost chip. The third line of each dataset specifies the colors of each of the C chips in stack S<sub>2</sub> starting with the bottommost chip. Colors are expressed as a single uppercase letter (A through H). There are no blanks or separators between the chip colors. The fourth line of each dataset contains 2*C uppercase letters, (A through H), representing the colors of the desired result of the shuffling of S<sub>1</sub> and S<sub>2</sub> zero or more times. The bottommost chip&rsquo;s color is specified first.&nbsp;</p>

### 출력

<p>Output for each dataset consists of a single line that displays an integer value which is the minimum number of shuffle operations required to get the desired resultant stack. If the desired result can not be reached using the input for the dataset, display the value negative 1 (-1) for the number of shuffle operations.</p>