# [Bronze III] 고려대학교에는 공식 와인이 있다 - 16673

[문제 링크](https://www.acmicpc.net/problem/16673)

### 성능 요약

시간 제한: 0.1 초, 메모리 제한: 256 MB

### 통계

제출: 4756, 정답: 3953, 맞힌 사람: 3524, 정답 비율: 83.626%

### 분류

수학, 사칙연산

### 문제 설명

<p>다음은 고려대학교 포털에 나와 있는 고대 와인에 대한 글 일부이다.</p>

<div style="background:#eeeeee;border:1px solid #cccccc;padding:5px 10px;">개교 100주년 공식 와인 &lsquo;라 까르돈느(La Cardonne) 2000년&rsquo;의 뒤를 잇는 우당 박종구 회장 기부 와인 &rsquo;나파밸리 2000(Napa Valley 2000)&lsquo;, 고대와인 &rsquo;클라랑델 루즈2005(Calarendelle Rouge 2005)&rsquo;,&nbsp;&lsquo;클라랑델 루즈 2009(Clarendelle Rouge 2009)&#39;, &lsquo;클라랑델 루즈 2011(Clarendelle Rouge 2011)&#39;을 판매하였으나,&nbsp;재고량 소진으로 인해 ㈜고대미래 크림슨스토어에서 독점 수입하여 선보이는 &lsquo;라스토 랑데올 2014(Rasteau L&rsquo;Andeol 2014)&rsquo; 와 &lsquo;샤토 클락 2014(Chateau Clarke 2014)&rsquo; 로 변경하여 판매합니다.</div>

<p>이 글을 본 수빈이는 고려대학교 와인 콜렉팅이라는 목표를 가지게 되었다. 하지만 그냥 모으면 재미가 없으니 규칙을 가지고 와인을 수집하려고 한다.</p>

<p>와인을 사기로 마음먹은 해를 0년 차라고 정의하고, <em>n</em>년 차에는 <em>Kn+Pn<sup>2</sup></em> 만큼의 와인을 사는 것을 목표로 했다. <em>K</em>는 수빈이의 고려대 애착 정도를 나타내는 상수이고, <em>P</em>는 수빈이의 구매중독 정도를 나타내는 상수이다.&nbsp;</p>

<p>그렇게 수빈이는 <em>C</em>년 동안 열심히 와인을 모았다. (마지막 해에 산 와인의 수는 <em>KC + PC<sup>2</sup></em>가 된다.)</p>

<p>수빈이는 와인이 이제 방에 가득 쌓여, 자기가 얼마나 수집했는지 수를 세기 어려웠다.</p>

<p>여러분이 수빈이가 와인을 얼마나 수집했는지 계산해주자.</p>

### 입력

<p>첫 번째 줄에 수빈이가 와인을&nbsp;모은 년수, 수빈이의 고려대 애착 정도, 수빈이의 구매중독 정도를 의미하는 정수 <em>C</em>, <em>K</em>, <em>P</em>가 공백으로 구분되어 주어진다. (0&nbsp;&le; <em>C</em> &le; 100, 0 &le; <em>K</em> &le;&nbsp;1000,&nbsp; 0 &le; <em>P</em> &le;&nbsp;100)</p>

### 출력

<p>첫 번째 줄에 수빈이가 <em>C</em>년 동안 수집한 와인 수를 출력한다.</p>