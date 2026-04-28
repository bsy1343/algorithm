# [Platinum V] NC 문자열 - 17301

[문제 링크](https://www.acmicpc.net/problem/17301)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 628, 정답: 166, 맞힌 사람: 122, 정답 비율: 30.886%

### 분류

수학, 조합론

### 문제 설명

<p>2019 shake!의 성사를 위해 바쁘게 뛰어다니던 준서는 문득 엔씨소프트의 <code>NC</code>가 무엇의 약자인지 궁금해졌다. <code>&quot;Next Company&quot;</code>, <code>&quot;Next Cinema&quot;</code> 등 자신이 아는 단어를 조합해봤지만, 정답이 무엇인지는 모른다. 어쩌면 <code>N</code>과 <code>C</code>로 시작하는 단어만 사용하는 게 아니라 <code>&quot;nullpoiNter exCeption&quot;</code>과 같은 이름도 가능하지 않을까?</p>

<p>고민하던 준서는 우선 자신이 알고 있는 단어 중 <code>N</code>이나 <code>C</code>가 들어간 단어를 목록으로 나열해보았다. 그 후 목록에 있는 총&nbsp;<em>N</em>개의 단어로 만들 수 있는 모든 <code>NC</code> 문자열을 적어&nbsp;엔씨소프트에 문의하기로 했다. 준서가 만들 수 있는 <code>NC</code> 문자열이란 다음과 같다.</p>

<ul>
	<li>준서의 목록 중 임의 개수만큼 단어를 고른다.</li>
	<li>한 문자열에서 같은 단어는 한 번만 사용할&nbsp;수 있다.</li>
	<li>고른 단어를 임의 순서로 배치하여 문자열을 만든다.</li>
	<li>만들어진 문자열에 <code>N</code>과 <code>C</code>가 등장하고, <code>N</code>보다 뒤에 등장하는 <code>C</code>가 있다면 이는 <code>NC</code> 문자열이다.</li>
</ul>

<p>예를 들어 준서가 알고 있는 단어가 {<code>&quot;NEVER&quot;</code>, <code>&quot;ENDING&quot;</code>, <code>&quot;CHANGE&quot;</code>, <code>&quot;NCSOFT&quot;</code>}라면 이 중 임의 단어를 선택해 배치한 <code>&quot;NCSOFT&quot;</code>, <code>&quot;NEVER ENDING CHANGE&quot;</code>&nbsp;등은 모두 <code>NC</code> 문자열이다. 하지만 <code>&quot;CHANGE&nbsp;ENDING&quot;</code>은&nbsp;<code>NC</code> 문자열이 아니다.</p>

<p>또한 <code>NC</code> 문자열은 단어 사이를&nbsp;띄어쓰기&nbsp;때문에 {<code>&quot;NC&quot;</code>, <code>&quot;NCNC&quot;</code>, <code>&quot;NCNCNC&quot;</code>}라는 단어가 있을 때 {<code>&quot;NC NCNC&quot;</code>, <code>&quot;NCNC NC&quot;</code>, <code>&quot;NCNCNC&quot;</code>}는 모두 다른 <code>NC</code> 문자열이다.</p>

<p>준서는 자신이 만들 수 있는 <code>NC</code> 문자열이 얼마나 많은지&nbsp;궁금해졌다. 준서가 만들 수 있는 <code>NC</code> 문자열의 총 개수를 세어보자. 단, 터무니없이 많은 조합이 생길 수 있으니 1,000,000,007로 나눈 나머지로 계산하자.</p>

### 입력

<p>첫 줄에 준서가 알고 있는 단어의 개수 <em>N</em>(1 &le; <em>N</em> &le; 100,000)이 주어진다.</p>

<p>이후 <em>N&nbsp;</em>줄에 걸쳐 서로 다른 <em>N</em>개의 단어가 주어진다. 모든 단어의 길이는 1 이상 10 이하이며, 알파벳 대문자로만 구성되어있다. 하나의 단어는 적어도 하나 이상의 <code>N</code>이나 <code>C</code>를 포함한다.</p>

### 출력

<p>한 줄에 준서가 만들 수 있는 <code>NC</code> 문자열 총 가짓수를 1,000,000,007로 나눈 나머지를 출력한다.</p>