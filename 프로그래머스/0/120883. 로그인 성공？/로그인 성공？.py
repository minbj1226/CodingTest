def solution(id_pw, db):
    # 아이디, 비번 모두 일치하면 login
    # 아이디 틀리면 fail
    # 비밀번호가 틀리면 wrong pw
    
    id = id_pw[0]
    pw = id_pw[1]
    
    for db_id, db_pw in db:
        if id == db_id:
            if pw == db_pw:
                return "login"
            return "wrong pw"
        
    return "fail"