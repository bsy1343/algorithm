# [Gold III] 홍수 - 11877

[문제 링크](https://www.acmicpc.net/problem/11877)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 64 MB

### 통계

제출: 554, 정답: 288, 맞힌 사람: 227, 정답 비율: 48.712%

### 분류

그리디 알고리즘, 해 구성하기

### 문제 설명

<p>남남서는 어젯밤 큰 홍수가 나는 꿈을 꿨다. 꿈 속에서, 물이 남남서의 키보다 높이 차올랐고, 남남서는 자신이 들고 있던 소중한 히스토그램을 놓쳐버렸다. 히스토그램을 간신히 다시 붙잡은 남남서는 자신의 히스토그램을 살펴보았다. 히스토그램이 젖어서 슬펐던 남남서는 슬프게 울다가 꿈에서 깼다.</p>

<p>히스토그램의 용량은 히스토그램에 물을 넘치지 않게 담았을 때 최대한 담을 수 있는 물의 양이다. 히스토그램의 각각의 열의 너비는 1이며, 높이는 h<sub>1</sub>, h<sub>2</sub>, &hellip;, h<sub>N</sub>이다. 오른쪽의 이미지는 물이 넘치지 않는 상태의 히스토그램의 예시이다.</p>

<p><img src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/userupload/namnamseo/20160211/c1759dad52c0b7d1cd1dbb10bbbf9dd1.png" style="float:right; height:318px; width:186px" /></p>

<p>조금 더 엄밀하게, 각각의 열의 위에 차올라있는 물의 높이를 v<sub>1</sub>, v<sub>2</sub>, &hellip;, v<sub>N</sub> 이라고 하자.</p>

<p>다음 조건들을 만족할 경우 물이 넘치지 않는다고 하자:</p>

<ul>
	<li>v<sub>1</sub> = 0, v<sub>N</sub> = 0</li>
	<li>v<sub>i</sub> &gt; 0인 모든 2 이상의 i에 대해 h<sub>i</sub> + v<sub>i</sub> &le; h<sub>i-1</sub> + v<sub>i-1</sub></li>
	<li>v<sub>i</sub> &gt; 0인 모든 1 &le; i &le; (N-1)인 i에 대해 h<sub>i</sub> + v<sub>i</sub> &le; h<sub>i+1</sub> + v<sub>i+1</sub></li>
</ul>

<p>꿈에서 깬 남남서는 아직 몽롱한 채로 꿈에 대해 떠올렸다. 남남서는 히스토그램의 열을 {1, 2, &hellip;, N}의 순열(permutation)로 구성해서, 히스토그램의 용량이 남남서가 좋아하는 숫자 X와 정확히 같게 만들 수 있을지 궁금해졌다. 두껍고 푹신한 이불 속에서 더 자려고 하고 있는 남남서가 일어날 수 있도록 이러한 히스토그램을 만들어주자.</p>

### 입력

<p>첫 줄에 자연수 N과 X가 주어진다. (1 &le; N &le; 1 000 000, 1 &le; X &le; 10<sup>15</sup>)</p>

### 출력

<p>용량이 정확히 X인 히스토그램을 만들 수 없다면 첫째 줄에 -1을 출력해라. 그렇지 않다면 용량이 X가 되는 히스토그램의 열&nbsp;h<sub>1</sub>, h<sub>2</sub>, &hellip;, h<sub>N</sub>를 출력해라. 그러한 방법이 여러 개가 있다면 아무 것이나 출력해도 된다.</p>

### 힌트

<p>첫 번째 예시에서, v<sub>1</sub> = 0, v<sub>2</sub> = 1, v<sub>3</sub> = 0이다.</p>

<p>두 번째 예시에서, v<sub>1</sub> = 0, v<sub>2</sub> = 0, v<sub>3</sub> = 1, v<sub>4</sub> = 0이다.</p>

<p>세 번째 예시는 위의 그림과 같다. 빗금친 부분은 물이 찬 부분이다.</p>