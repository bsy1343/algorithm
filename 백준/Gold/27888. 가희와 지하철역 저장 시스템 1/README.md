# [Gold II] 가희와 지하철역 저장 시스템 1 - 27888

[문제 링크](https://www.acmicpc.net/problem/27888)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 665, 정답: 130, 맞힌 사람: 100, 정답 비율: 19.380%

### 분류

구현, 자료 구조, 문자열, 집합과 맵, 비트마스킹, 해시를 사용한 집합과 맵, 파싱

### 문제 설명

<p>가희는 <code>n</code>개의 지하철역 정보를 보기 위한 시스템을 만들었습니다. 이 시스템은 정말 단순하게 동작합니다.</p>

<ul>
	<li>유저가 역 <code>station</code>의 특징을 한 번도 업데이트하지 않은 경우, 역 <code>station</code>의 특징은 없습니다.</li>
	<li>각 역은 유저들이 업데이트한 특징이 있습니다. 예를 들어, <code>deepstation</code>, <code>longescalator</code>, <code>dungeon</code>과 같은 것들입니다.</li>
	<li><code>deepstation</code>, <code>longescalator</code>, <code>dungeon</code>과 같은 특징을 입력했을 때 조건에 맞는 역들이 나타나게 됩니다.</li>
</ul>

<p>그런데 사용하는 유저가 많아질수록 가희가 만들어 놓은 시스템이 느려지기 시작했습니다. 가희를 도와주세요.</p>

### 입력

<p>첫 번째 줄에 <code>n</code>이 주어집니다.</p>

<p>다음 <code>n</code>개의 줄에 역 이름이 <strong>한 줄에 하나씩</strong> 주어집니다.</p>

<p>다음 줄에 요청의 개수 <code>r</code>이 주어집니다.</p>

<p>다음 <code>r</code>개의 줄에 요청이 다음 형식 중 하나로 주어집니다.</p>

<ul>
	<li><code>U</code> <code>station</code> <code>features</code>

	<ul>
		<li>역 <code>station</code>의 특징을 <code>features</code>로 업데이트합니다.</li>
	</ul>
	</li>
	<li><code>G</code> <code>features</code>
	<ul>
		<li><code>features</code>의 특징을 <strong>모두 가진</strong> 역의 개수를 출력합니다.</li>
	</ul>
	</li>
</ul>

<p>이때 <code>features</code>는 특징이 여러 개인 경우 <strong>콤마(<span style="color:#E74C3C;"><code>,</code></span>)로 구분되어</strong> 주어집니다. 또한 중복된 특징은 주어지지 않습니다.</p>

<p><code>station</code>은 주어진 <code>n</code>개의 지하철역 이름 중 하나입니다..</p>

<p>예를 들어, <code>soongsiluniv</code>역의 특징을 <code>line7</code>과 <code>deep</code>으로 업데이트 하려는 경우 요청은 아래와 같이 주어집니다.</p>

<p style="text-align: center;"><code>U soongsiluniv</code> <code>line7,deep</code></p>

<p>또한 특징 <code>beautiful</code>과 <code>dungeon</code>이라는 특징을 가지는 역의 개수를 구하라는 요청은 아래와 같이 주어집니다.</p>

<p style="text-align: center;"><code>G</code> <code>beautiful,dungeon</code></p>

### 출력

<p>조건을 만족하는 역의 개수를 구하라는 요청이 들어올 때마다 한 줄에 하나씩 답을 출력해 주세요.</p>

### 제한

<ul>
	<li><code>1</code> &le; <code>n</code> &le; <code>5&times;10<sup>5</sup></code></li>
	<li><code>1</code> &le; <code>r</code> &le; <code>10<sup>5</sup></code></li>
	<li>주어지는 역명의 길이는 1 이상 10 이하이며, 역명은 중복되지 않습니다. 역명은 알파벳 대소문자와 숫자로만 이루어져 있습니다.</li>
	<li>요청에 주어지는 <code>features</code>의 길이 총합은 <code>2&times;10<sup>6</sup></code>을 넘어가지 않습니다. 이때, 구분자 <code>,</code>는 길이 총합에서 제외됩니다.</li>
	<li>전체 <code>U</code> 요청에 나타난 <strong>모든 특징의 종류는 1개 이상 9개 이하</strong>입니다.</li>
	<li>특징은 알파벳 대소문자와 숫자로만 이루어져 있으며, 길이는 1 이상 10 이하입니다.</li>
	<li><code>G</code> 요청은 하나 이상 주어집니다.</li>
</ul>

### 힌트

<p>2개의 <code>U</code> 요청이 아래와 같았다고 해 보겠습니다.</p>

<ul>
	<li><code>U</code> <code>a,b,c,d,e,f,g</code></li>
	<li><code>U</code> <code>h,i,j,k</code></li>
</ul>

<p>이러한 요청은 들어오지 않습니다. 전체 <strong><code>U</code> 업데이트에 사용된 모든 특징의 종류</strong>가 <code>a,b,c,d,e,f,g,h,i,j,k</code>로 11개이기 때문입니다.</p>

<p>또한, <strong><code>G</code> 요청은 <code>U</code> 요청에 나오지 않은 특징이 나올 수 있습니다.</strong> [예제 2]는 이를 보여줍니다. </p>